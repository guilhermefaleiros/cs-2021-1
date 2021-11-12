package ex01;

public class Cachorro extends Animal {

    public Cachorro(String nome, Integer idade) {
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
