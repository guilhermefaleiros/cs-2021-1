import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio06 {

    // Classe com objetivo de gerar os antecessores e sucessores dado um certo número inteiro
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var logger = Logger.getLogger("Exercicio06");

        logger.log(Level.INFO, "Número: ");
        var number = scanner.nextInt();

        var successor = number + 1;
        var predecessor = number - 1;

        logger.log(Level.INFO, "Sucessor: {0} ", successor);
        logger.log(Level.INFO, "Antecessor: {0} ", predecessor);
    }
}
