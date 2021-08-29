package ex04;

import ex01.Animal;

public class Hipopotamo extends Animal {

    public Hipopotamo() {
    }

    public Hipopotamo(String nome, Integer idade) {
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
