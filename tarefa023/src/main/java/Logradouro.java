import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Logradouro {
    private String nome;
    private TipoLogradouro tipoLogradouro;
}
