import java.util.List;

public interface EnderecoService {
    List<Logradouro> consultaPorTipo(TipoLogradouro tipoLogradouro);
    List<Endereco> consultaPorTipo(TipoEndereco tipoEndereco);
    List<Endereco> consultaPorCep(int cep);
    List<Endereco> consultaPorLogradouro(Logradouro logradouro);
    List<Endereco> consultaPorBairro(Bairro bairro);
    List<Endereco> consultaPorCidade(Cidade cidade);
    List<Cidade> listaCidadesPorEstado(Estado estado);
    List<Estado> consultaPorPais(Pais pais);
}
