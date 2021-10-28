import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Cidade {
    private String nome;
    private Estado estado;
}
