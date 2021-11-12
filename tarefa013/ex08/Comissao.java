package ex08;

public enum Comissao {

    GERENTE(1500.00), SUPERVISOR(600.00), VENDEDOR(250.00);

    Comissao(Double valor) {
        this.valor = valor;
    }

    private Double valor;

    public Double getValor() {
        return valor;
    }
}
