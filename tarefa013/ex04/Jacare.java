package ex04;

import ex01.Animal;

public class Jacare extends Animal {

    public Jacare() {
    }

    public Jacare(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void todasAsAcoes() {
        this.nadar();
        this.emitirSom();
    }

    public void nadar() {
        System.out.println("Nadando...");
    }
}
