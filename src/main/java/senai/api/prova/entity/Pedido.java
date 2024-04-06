package senai.api.prova.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String descricao;

    private BigDecimal valor;   

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = true)
    @Fetch(FetchMode.JOIN)
    private Cliente cliente;
}
