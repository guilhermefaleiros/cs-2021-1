package ex02;

import ex01.Cachorro;
import ex01.Cavalo;
import ex01.Preguica;

public class AnimalTeste {

    public static void main(String[] args) {
        var cachorro = new Cachorro("Pirineu", 5);
        var preguica = new Preguica("Caio", 8);
        var cavalo = new Cavalo("Pocotó", 3);

        cavalo.emitirSom();
        preguica.emitirSom();
        cachorro.emitirSom();
    }

}
