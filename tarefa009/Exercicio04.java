import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio04 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var logger = Logger.getLogger("Exercicio04");

        logger.log(Level.INFO, "IPI: ");
        var ipi = scanner.nextDouble();

        logger.log(Level.INFO, "Código peça 1: ");
        scanner.next();

        logger.log(Level.INFO, "Valor unitário peça 1: ");
        var value1 = scanner.nextDouble();

        logger.log(Level.INFO, "Quantidade de peças 1: ");
        var units1 = scanner.nextInt();

        logger.log(Level.INFO, "Código peça 2: ");
        scanner.next();

        logger.log(Level.INFO, "Valor unitário peça 2: ");
        var value2 = scanner.nextDouble();

        logger.log(Level.INFO, "Quantidade de peças 2: ");
        var units2 = scanner.nextInt();

        var total = calculateTotal(ipi, units1, value1, units2, value2);
        logger.log(Level.INFO, "Total: R$ {0}", total);
    }

    public static double calculateTotal(double ipi, int units1, double value1, int units2, double value2) {
      return ((units1 * value1) + (units2 * value2)) * ((ipi / 100) + 1);
    }
}
