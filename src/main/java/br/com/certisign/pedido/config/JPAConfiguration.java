package br.com.certisign.pedido.config;

import br.com.certisign.pedido.repository.PedidoRepository;
import br.com.certisign.pedido.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@EnableJpaAuditing
@ComponentScan("br.com.certisign.pedido.config")
@EnableJpaRepositories(basePackageClasses= {PedidoRepository.class})
public class JPAConfiguration implements WebMvcConfigurer {

    @Autowired
    PedidoRepository pedidoRepository;

    @Bean
    PedidoService pedidoService() {
        return new PedidoService(pedidoRepository);
    }
}
