package ex04;

import ex01.Animal;

public class Tigre extends Animal {

    public Tigre() {
    }

    public Tigre(String nome, Integer idade) {
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
