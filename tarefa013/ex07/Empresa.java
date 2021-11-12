package ex07;

import ex05.Funcionario;
import ex08.Comissao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Empresa {

    private final List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa () {
        var caio = new Funcionario("Caio", "ex01", Comissao.VENDEDOR);
        caio.concluirEnsinoBasico("Escola 1");

        var jorge = new Funcionario("Jorge", "2", Comissao.VENDEDOR);
        jorge.concluirEnsinoBasico("Escola 2");

        var julia = new Funcionario("Julia", "3", Comissao.VENDEDOR);
        julia.concluirEnsinoMedio("Escola 3", "Escola 3");

        var maria = new Funcionario("Maria", "4", Comissao.VENDEDOR);
        maria.concluirEnsinoMedio("Escola 3", "Escola 3");

        var clara = new Funcionario("Clara", "5", Comissao.VENDEDOR);
        clara.concluirEnsinoMedio("Escola 3", "Escola 3");

        var guilherme = new Funcionario("Guilherme", "6", Comissao.VENDEDOR);
        guilherme.concluirEnsinoMedio("Escola 3", "Escola 3");

        var luiz = new Funcionario("Luiz", "7", Comissao.SUPERVISOR);
        luiz.concluirEnsinoSuperior("Escola 4", "Escola 4", "Universidade 1");

        var mariana = new Funcionario("Mariana", "8", Comissao.SUPERVISOR);
        mariana.concluirEnsinoSuperior("Escola 4", "Escola 4", "Universidade 1");

        var beatriz = new Funcionario("Beatriz", "9", Comissao.GERENTE);
        beatriz.concluirEnsinoSuperior("Escola 4", "Escola 4", "Universidade 1");

        var mario = new Funcionario("Mario", "10", Comissao.SUPERVISOR);
        mario.concluirEnsinoSuperior("Escola 4", "Escola 4", "Universidade 1");

        this.adicionarVariosFuncionarios(caio, jorge, julia, maria, clara, guilherme, luiz, mariana, beatriz, mario);

    }

    public void calcularCustos() {
        var ensinoBasico = this.calcularCustosPorEscolaridade(Escolaridade.ENSINO_BASICO);
        var ensinoMedio = this.calcularCustosPorEscolaridade(Escolaridade.ENSINO_MEDIO);
        var ensinoSuperior = this.calcularCustosPorEscolaridade(Escolaridade.ENSINO_SUPERIOR);

        var total = ensinoBasico + ensinoMedio + ensinoSuperior;

        System.out.println("CUSTOS TOTAIS: R$" + total);
        System.out.println("CUSTOS DE FUNCIONÁRIOS COM ENSINO BÁSICO: R$" + ensinoBasico);
        System.out.println("CUSTOS DE FUNCIONÁRIOS COM ENSINO MÉDIO: R$" + ensinoMedio);
        System.out.println("CUSTOS DE FUNCIONÁRIOS COM ENSINO SUPERIOR: R$" + ensinoSuperior);
    }

    private Double calcularCustosPorEscolaridade(Escolaridade escolaridade) {
        return this.funcionarios.stream()
                .filter(funcionario -> funcionario.getEscolaridade().equals(escolaridade))
                .mapToDouble(funcionario -> funcionario.getRenda() + funcionario.getComissao().getValor()).sum();
    }

    public void adicionarVariosFuncionarios(Funcionario ...funcionariosLista) {
        this.funcionarios.addAll(Arrays.asList(funcionariosLista));
    }

    public void imprimirTodosFuncionarios() {
        this.funcionarios.stream().forEach(funcionario -> System.out.println(funcionario.toString()));
    }

}
