package ex04;

import ex01.Animal;

public class Papagaio extends Animal {

    public Papagaio() {
    }

    public Papagaio(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void todasAsAcoes() {
        this.voar();
        this.emitirSom();
    }

    public void voar() {
        System.out.println("Voando...");
    }
}
