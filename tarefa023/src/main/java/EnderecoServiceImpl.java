import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EnderecoServiceImpl implements  EnderecoService{

    private final List<CadastroEndereco> bancoDeEnderecosCadastrados =
            Arrays.asList(
                    CadastroEndereco.builder()
                            .endereco(Endereco.builder()
                                    .bairro(Bairro.builder()
                                            .nome("Bairro 1")
                                            .cidade(Cidade.builder()
                                                    .nome("Goiânia")
                                                    .estado(Estado.builder()
                                                            .nome("Goiás")
                                                            .pais(Pais.builder()
                                                                    .nome("Brasil")
                                                                    .build())
                                                            .build())
                                                    .build())
                                            .build())
                                    .build())
                            .build(),
                    CadastroEndereco.builder()
                            .endereco(Endereco.builder()
                                    .bairro(Bairro.builder()
                                            .nome("Bairro 1")
                                            .cidade(Cidade.builder()
                                                    .nome("Goiânia")
                                                    .estado(Estado.builder()
                                                            .nome("Goiás")
                                                            .pais(Pais.builder()
                                                                    .nome("Brasil")
                                                                    .build())
                                                            .build())
                                                    .build())
                                            .build())
                                    .build())
                            .build()
            );

    @Override
    public List<Logradouro> consultaPorTipo(TipoLogradouro tipoLogradouro) {
        return new ArrayList<>(this.bancoDeEnderecosCadastrados
                .stream()
                .filter(cadastroEndereco -> cadastroEndereco
                        .getEndereco().getLogradouro().getTipoLogradouro().equals(tipoLogradouro))
                .map(cadastroEndereco -> cadastroEndereco.getEndereco().getLogradouro())
                .collect(Collectors.toSet()));
    }

    @Override
    public List<Endereco> consultaPorTipo(TipoEndereco tipoEndereco) {
        return this.obterEndereco(endereco -> endereco.getTipoEndereco().equals(tipoEndereco));
    }

    @Override
    public List<Endereco> consultaPorCep(int cep) {
        return this.obterEndereco(endereco -> endereco.getCEP().equals(cep));
    }

    @Override
    public List<Endereco> consultaPorLogradouro(Logradouro logradouro) {
        return this.obterEndereco(endereco -> endereco.getLogradouro().equals(logradouro));
    }

    @Override
    public List<Endereco> consultaPorBairro(Bairro bairro) {
        return this.obterEndereco(endereco -> endereco.getBairro().equals(bairro));
    }

    @Override
    public List<Endereco> consultaPorCidade(Cidade cidade) {
        return this.obterEndereco(endereco -> endereco.getBairro().getCidade().equals(cidade));
    }

    @Override
    public List<Cidade> listaCidadesPorEstado(Estado estado) {
        return new ArrayList<>(this.bancoDeEnderecosCadastrados
                .stream()
                .map(cadastroEndereco -> cadastroEndereco.getEndereco().getBairro().getCidade())
                .filter(cidade -> cidade.getEstado().equals(estado))
                .collect(Collectors.toSet()));
    }

    private List<Endereco> obterEndereco(Predicate<Endereco> predicate) {
        return new ArrayList<>(this.bancoDeEnderecosCadastrados
                .stream()
                .map(CadastroEndereco::getEndereco)
                .filter(predicate)
                .collect(Collectors.toSet()));
    }

    @Override
    public List<Estado> consultaPorPais(Pais pais) {
        return new ArrayList<>(this.bancoDeEnderecosCadastrados
                .stream()
                .map(cadastroEndereco -> cadastroEndereco
                        .getEndereco()
                        .getBairro()
                        .getCidade()
                        .getEstado())
                .filter(estado -> estado.getPais().equals(pais))
                .collect(Collectors.toSet()));
    }
}
