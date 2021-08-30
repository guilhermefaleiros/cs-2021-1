package ex05;

import ex07.Escolaridade;
import ex08.Comissao;

public class Funcionario {

    private final String nome;
    private final String codigo;
    private String escolaEnsinoBasico;
    private String escolaEnsinoMedio;
    private String universidade;


    private Comissao comissao;
    private Escolaridade escolaridade;

    private Double renda;

    public Funcionario(String nome, String codigo, Comissao comissao) {
        this.nome = nome;
        this.codigo = codigo;
        this.renda = 1000.00;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public Double getRenda() {
        return renda;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getEscolaEnsinoBasico() {
        return escolaEnsinoBasico;
    }

    public String getEscolaEnsinoMedio() {
        return escolaEnsinoMedio;
    }

    public String getUniversidade() {
        return universidade;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void concluirEnsinoBasico(String escola) {
        this.escolaEnsinoBasico = escola;
        this.aumentarRenda(10.0);
        this.escolaridade = Escolaridade.ENSINO_BASICO;
    }

    public void concluirEnsinoMedio(String escolaBasica, String escolaEnsinoMedio) {
        this.concluirEnsinoBasico(escolaBasica);
        this.escolaEnsinoMedio = escolaEnsinoMedio;
        this.aumentarRenda(50.0);
        this.escolaridade = Escolaridade.ENSINO_MEDIO;
    }

    public void concluirEnsinoSuperior(String escolaBasica, String escolaEnsinoMedio, String universidade) {
        this.concluirEnsinoMedio(escolaBasica, escolaEnsinoMedio);
        this.universidade = universidade;
        this.aumentarRenda(100.0);
        this.escolaridade = Escolaridade.ENSINO_SUPERIOR;
    }

    private void aumentarRenda(Double percentual) {
        this.renda = this.renda + ((this.renda / 100) * percentual);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nome: " + this.nome);
        builder.append("\n");
        builder.append("Comissão: " + this.comissao.getValor());
        builder.append("\n");

        var salario = this.renda + this.comissao.getValor();
        builder.append("Salário total: " + salario);
        builder.append("\n");

        return builder.toString();
    }
}
