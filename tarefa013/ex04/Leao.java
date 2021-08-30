package ex04;

import ex01.Animal;

public class Leao extends Animal {

    public Leao() {
    }

    public Leao(String nome, Integer idade) {
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
