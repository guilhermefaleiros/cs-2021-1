import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Bairro {
    private String nome;
    private Cidade cidade;
}
