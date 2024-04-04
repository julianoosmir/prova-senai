package senai.api.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import senai.api.prova.entity.Pedido;

@Repository
public interface PedidoRepository  extends JpaRepository<Pedido,Long> {
}
