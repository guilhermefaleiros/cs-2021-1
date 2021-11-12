package ex01;

public abstract class Animal {
    private String nome;
    private Integer idade;

    public Animal() {}

    public Animal(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println(this.getNome() + ": Emitindo som...");
    }

    public abstract void todasAsAcoes();


}
