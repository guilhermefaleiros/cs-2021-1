import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Endereco {
    private TipoEndereco tipoEndereco;
    private Logradouro logradouro;
    private Integer numero;
    private String complementoNumero;
    private String complementoEndereco;
    private Integer CEP;
    private Bairro bairro;
}
