package ex01;

public class Preguica extends Animal {

    public Preguica(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void todasAsAcoes() {
        this.subirEmArvore();
        this.emitirSom();
    }

    public void subirEmArvore() {
        System.out.println("Subindo em árvore...");
    }

}
