package ex01;

public class Cavalo extends Animal {

    public Cavalo(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void todasAsAcoes() {
        this.correr();
        this.emitirSom();
    }

    public void correr() {
        System.out.println("Correndo...");
    }
}
