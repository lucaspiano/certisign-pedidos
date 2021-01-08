package br.com.certisign.pedido.service;

import br.com.certisign.pedido.domain.entity.PedidoEntity;
import br.com.certisign.pedido.repository.PedidoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class PedidoServiceUnitTest {
    private PedidoRepository pedidoRepository = Mockito.mock(PedidoRepository.class);

    PedidoEntity pedidoEntity1 = new PedidoEntity();
    PedidoEntity pedidoEntity2 = new PedidoEntity();
    PedidoEntity pedidoEntity3 = new PedidoEntity();

    private static final String newID = "newID";

    private static final String oldID = "oldID";


    List<PedidoEntity> resultPedidoEntity = new ArrayList<>();

    PedidoEntity pedidoEntity_DTO = new PedidoEntity();

    PedidoEntity pedidoEntity_fromDB = new PedidoEntity();

    LocalDate localDate = LocalDate.now();

    private Long id = 1L;

    private PedidoService pedidoService = new PedidoService(pedidoRepository);

    private void populateBean() {
        //used on post
        pedidoEntity1.setId(1L);
        pedidoEntity1.setPedId(6974931);
        pedidoEntity1.setPrdId("ACMA1PFC");
        pedidoEntity1.setPedfi("3898839D");
        pedidoEntity1.setPedseed("21650E");
        pedidoEntity1.setPedfi("teste1");
        pedidoEntity1.setUsuId(1);
        pedidoEntity1.setPfsCpf(123456);
        pedidoEntity1.setPedNumRenovacao(12345);
        pedidoEntity1.setPedIntegrado(12345);
        pedidoEntity1.setIcDocPendente(12345);
        pedidoEntity1.setIcRenovacaoConcorrente(12345);

        //used on consult(get), update and delete
        pedidoEntity2.setId(2L);
        pedidoEntity2.setPedId(6974932);
        pedidoEntity2.setPrdId("OABA3PFIS");
        pedidoEntity2.setPedfi("896F29E34");
        pedidoEntity2.setPedseed("69A38C");
        pedidoEntity2.setUsuId(1);
        pedidoEntity2.setPfsCpf(123456);
        pedidoEntity2.setPedNumRenovacao(12345);
        pedidoEntity2.setPedIntegrado(12345);
        pedidoEntity2.setIcDocPendente(12345);
        pedidoEntity2.setIcRenovacaoConcorrente(12345);

        pedidoEntity3.setId(3L);
        pedidoEntity3.setPedId(6974932);
        pedidoEntity3.setPrdId("OABA3PFIS");
        pedidoEntity3.setPedfi("98F6F5E57");
        pedidoEntity3.setPedseed("1F08E5");
        pedidoEntity3.setUsuId(1);
        pedidoEntity3.setPfsCpf(123456);
        pedidoEntity3.setPedNumRenovacao(12345);
        pedidoEntity3.setPedIntegrado(12345);
        pedidoEntity3.setIcDocPendente(12345);
        pedidoEntity3.setIcRenovacaoConcorrente(12345);

        resultPedidoEntity.add(pedidoEntity1);
        resultPedidoEntity.add(pedidoEntity2);
        resultPedidoEntity.add(pedidoEntity3);
    }

    private void populateBeanUpdate() {
        pedidoEntity_DTO.setId(id);
        pedidoEntity_DTO.setPedfi(newID);
        pedidoEntity_DTO.setPrdId(newID);

        pedidoEntity_fromDB.setId(id);
        pedidoEntity_fromDB.setPedfi(oldID);
        pedidoEntity_DTO.setPrdId(oldID);

    }

    //@POST - create()
    @Test
    void givenPedidoEntityWhenCallsCreateThenReturnPedidoEntityWithIdAfterSaveTest() {
        //given
        populateBean();

        //when
        when(pedidoRepository.save(pedidoEntity1)).thenReturn(pedidoEntity1);

        PedidoEntity savedPedidoEntity = pedidoService.create(pedidoEntity1);

        //then
        Assertions.assertNotNull(savedPedidoEntity);
        Assertions.assertNotNull(savedPedidoEntity.getPedId());
        Assertions.assertEquals(6974931, savedPedidoEntity.getPedId());
    }

    //@GET - getAllPedidos()
    @Test
    void givenNoParametersGetAllPedidosWhenCallingFindAllThenPedidoRepositoryAllPedidosAreShownTest() {
        //given
        populateBean();

        //when
        when(pedidoRepository.save(pedidoEntity1)).thenReturn(pedidoEntity1);
        when(pedidoRepository.save(pedidoEntity2)).thenReturn(pedidoEntity2);
        when(pedidoRepository.save(pedidoEntity3)).thenReturn(pedidoEntity3);
        when(pedidoRepository.findAll()).thenReturn(resultPedidoEntity);

        List<PedidoEntity> pedidoEntityList = pedidoService.getAllPedidos();

        //then
        Assertions.assertNotNull(pedidoEntityList);
        Assertions.assertEquals("ACMA1PFC", pedidoEntityList.get(0).getPrdId());
        Assertions.assertEquals("896F29E34", pedidoEntityList.get(1).getPedfi());
        Assertions.assertEquals("1F08E5", pedidoEntityList.get(2).getPedseed());
    }

    //@GET(id) - findById(id)
    @Test
    void givenIDPedidoEntityWhenCallingPedidoServiceFindByIdThenPedidoRepositoryByIdReturnsPedidoEntityTest() {
        //given
        populateBean();

        //when
        when(pedidoRepository.findById(pedidoEntity1.getId())).thenReturn(Optional.of(pedidoEntity1));
        when(pedidoRepository.existsById(1L)).thenReturn(true);

        Optional<PedidoEntity> pedidoEntityOptional = pedidoService.findById(pedidoEntity1.getId());

        //then
        Assertions.assertNotNull(pedidoEntityOptional);
        Assertions.assertEquals(pedidoEntity1.getPrdId(), pedidoEntityOptional.get().getPrdId());
    }

    //@UPDATE - update(id)
    @Test
    void givenIDBookEntityWhenCallingBookServiceUpdateThenBookRepositoryUpdateByIdTest() {
        //given
        populateBeanUpdate();

        //when
        when(pedidoRepository.existsById(id)).thenReturn(true);
        when(pedidoRepository.findById(id)).thenReturn(Optional.of(pedidoEntity_fromDB));
        when(pedidoRepository.save(pedidoEntity_DTO)).thenReturn(pedidoEntity_DTO);

        Optional<PedidoEntity> pedidoEntityOptional = pedidoService.update(id,pedidoEntity_DTO);

        //then
        Assertions.assertNotNull(pedidoEntityOptional);
        Assertions.assertEquals(newID, pedidoEntityOptional.get().getPedfi());
    }

    //@DELETE(id) - delete(id)
    @Test
    void givenIdPedidoEntityWhenCallingPedidoServiceDeleteThenPedidoRepositoryDeleteTest() {
        //given
        populateBean();

        //when
        when(pedidoRepository.findById(id)).thenReturn(Optional.ofNullable(resultPedidoEntity.remove(0)));

        pedidoService.delete(id);

        //then
        Assertions.assertEquals(2, resultPedidoEntity.size());
        Assertions.assertEquals(false, resultPedidoEntity.contains(pedidoEntity1));
        Assertions.assertEquals(true, resultPedidoEntity.contains(pedidoEntity2));
    }
}
