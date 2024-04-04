package senai.api.prova.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import senai.api.prova.model.ViaCepModel;

@Data
@Builder
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String bairro;
    private String logradouro;
    private String cep;
    private String complemento;
    private String estado;
    private String cidade;
    private int numero;

}
