package br.com.certisign.pedido.repository;

import br.com.certisign.pedido.domain.entity.PedidoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PedidoRepository extends CrudRepository<PedidoEntity, Long>  {
    List<PedidoEntity> findAll();
    Optional<PedidoEntity> findById(Long id);
}

