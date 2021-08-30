package ex04;

import ex01.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    private List<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void pecorrerTodasJaulas() {
        this.animais.forEach(Animal::todasAsAcoes);
    }

}
