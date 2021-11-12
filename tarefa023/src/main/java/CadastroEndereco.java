import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// ANTIGO
//public class CadastroEndereco {
//    private String tipoEndereco; //comercial, residencial, etc.
//    private String tipoLogradouro; //rua, avenida, alameda, marginal, via, viela, travessa, etc.
//    private String nomeLogradouro;
//    private int numero;
//    private String complementoNumero; //exemplo 13-A, o complemento é -A.
//    private String complementoEndereço; //quadra, lote, apartamento, etc.
//    private String bairro;
//    private Integer CEP;
//    private String cidade;
//    private String estado;
//    private String pais;
//}

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CadastroEndereco {
    private Endereco endereco;
}
