package br.com.certisign.pedido.controller;

import br.com.certisign.pedido.PedidosApplication;
import br.com.certisign.pedido.domain.entity.PedidoEntity;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PedidosApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class PedidoControllerUnitTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private MockMvc mockMvc;

    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    PedidoEntity pedidoEntity1 = new PedidoEntity();

    PedidoEntity pedidoEntity2 = new PedidoEntity();

    PedidoEntity pedidoEntity3 = new PedidoEntity();

    List<PedidoEntity> pedidoEntityList = new ArrayList<>();

    private static final String pedidosContext = "/pedidos";

    @Before
    public void setup() throws Exception {
        MockitoAnnotations.openMocks(this);
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();

        pedidoEntity1.setId(1L);
        pedidoEntity1.setPedId(6974931);
        pedidoEntity1.setPrdId("ACMA1PFC");
        pedidoEntity1.setPedfi("3898839D");
        pedidoEntity1.setPedseed("21650E");

        pedidoEntity2.setId(2L);
        pedidoEntity2.setPedId(6974932);
        pedidoEntity2.setPrdId("OABA3PFIS");
        pedidoEntity2.setPedfi("896F29E34");
        pedidoEntity2.setPedseed("69A38C");

        pedidoEntity3.setId(3L);
        pedidoEntity3.setPedId(6974932);
        pedidoEntity3.setPrdId("OABA3PFIS");
        pedidoEntity3.setPedfi("98F6F5E57");
        pedidoEntity3.setPedseed("1F08E5");

        pedidoEntityList.add(pedidoEntity1);
        pedidoEntityList.add(pedidoEntity2);
        pedidoEntityList.add(pedidoEntity3);
    }

    @Test //it checks the @Configuration class
    public void givenWacWhenServletContextThenItProvidesPedidoControllerTest() {
        ServletContext servletContext = wac.getServletContext();

        Assertions.assertNotNull(servletContext);
        Assertions.assertTrue(servletContext instanceof ServletContext);
        Assertions.assertNotNull(wac.getBean("JPAConfiguration"));
    }

    @Test  //@GET("/pedidos")
    public void givenPedidoEntity_whenGetAllPedidos_thenStatus200Test()
            throws Exception {

        mockMvc.perform(get(pedidosContext)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful());
    }

    @Test //@POST("/pedidos")
    public void givenPedidoDTOWhenCallingPedidoControllerCreateThenReturnLocationStatus201Test()
       throws Exception {
        pedidoEntity1.setId(4L);
        pedidoEntity1.setPedId(4444444);
        pedidoEntity1.setPrdId("OABA4PFIS");
        pedidoEntity1.setPedfi("444F44E44");
        pedidoEntity1.setPedseed("44A48C");

        HttpEntity<PedidoEntity> entity = new HttpEntity<>(pedidoEntity1, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/pedidos"),
                HttpMethod.POST, entity, String.class);

        String actual = String.valueOf(response.getHeaders().get(HttpHeaders.LOCATION));
        Assertions.assertTrue(actual.contains("/pedidos"));
        Assertions.assertEquals(201, response.getStatusCodeValue());
    }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }

    @Test //@UPDATE("/pedidos/{id}")
    void givenBookDTOWhenCallingPedidoControllerUpdateThenReturnStatus200Test() throws Exception {
        pedidoEntity1.setId(2L);

        pedidoEntity1.setPedId(6974232);
        pedidoEntity1.setPrdId("ACMA1PFD");
        pedidoEntity1.setPedfi("3898839A");
        pedidoEntity1.setPedseed("21650G");

        HttpEntity<PedidoEntity> entity = new HttpEntity<>(pedidoEntity1, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/pedidos/2"),
                HttpMethod.PUT, entity, String.class);

        Assertions.assertEquals(200, response.getStatusCodeValue());
    }


    @Test //@DELETE("pedidos/{id})
    void givenIdWhenCallingPedidoControllerDeleteThenReturnStatus204NothingOnThePayloadTest()
            throws Exception {
        pedidoEntity1.setId(1L);

        HttpEntity<PedidoEntity> entity = new HttpEntity<>(pedidoEntity1, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/pedidos/1"),
                HttpMethod.DELETE, entity, String.class);
        Assertions.assertEquals(204, response.getStatusCodeValue());
    }



}