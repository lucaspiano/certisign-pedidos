package br.com.certisign.pedido.controller;

import br.com.certisign.pedido.domain.dto.PedidoDTO;
import br.com.certisign.pedido.domain.entity.PedidoEntity;
import br.com.certisign.pedido.service.PedidoService;
import br.com.certisign.pedido.util.ConverterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

//Classe que trata os requests/responses - Pedidos REST API
// by Lucas Abrao lucas.abrao@avenuecode.com
@RestController
public class PedidoController {

    private PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping(value="/pedidos")
    public List<PedidoDTO> getAllPedidos() {
        return ConverterUtil.convertEntityListToDTOList(pedidoService.getAllPedidos());
    }

    @GetMapping("/pedidos/{id}")
    public ResponseEntity<PedidoDTO> getPedido(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        PedidoEntity savedBookEntity = pedidoService.findById(id).orElseThrow(() -> new ResourceNotFoundException("" +
                "Pedido nao existente para este pedido " + id));
        return ResponseEntity.ok().body(ConverterUtil.transformPedidosEntityIntoPedidosDTO(savedBookEntity));
    }


    @PostMapping(value = "/pedidos", consumes = "application/json", produces = "application/json")
    public ResponseEntity<PedidoDTO> create(@RequestBody PedidoDTO pedidoDTO) {
        PedidoEntity savedPedidoEntity = pedidoService.create(ConverterUtil.
                transformPedidosDTOIntoPedidosEntity(pedidoDTO));
        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(pedidoDTO.getPedId())
                .toUri();
        return ResponseEntity.created(location)
                .body(ConverterUtil.transformPedidosEntityIntoPedidosDTO(savedPedidoEntity));
    }


    @PutMapping("pedidos/{id}")
    public ResponseEntity<PedidoDTO> update(@PathVariable(value = "id") Long id,
                                            @Valid @RequestBody PedidoDTO pedidoDTO) throws ResourceNotFoundException {
        PedidoEntity pedidoEntity = ConverterUtil.transformPedidosDTOIntoPedidosEntity(pedidoDTO);

        return ResponseEntity.ok(ConverterUtil.transformPedidosEntityIntoPedidosDTO(
                pedidoService.update(id,pedidoEntity).get()));
    }

    @DeleteMapping("/pedidos/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        pedidoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
