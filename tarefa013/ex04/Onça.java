package ex04;

import ex01.Animal;

public class Onça extends Animal {

    public Onça() {
    }

    public Onça(String nome, Integer idade) {
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
