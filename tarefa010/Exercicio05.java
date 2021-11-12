import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio05 {

    // Classe principal para cálculo de quantidade de salários mínimos que a pessoal recebe
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var logger = Logger.getLogger("Exercicio05");

        logger.log(Level.INFO, "Salário: ");
        var salary = scanner.nextDouble();

        logger.log(Level.INFO, "Salário mínimo: ");
        var minimalSalary = scanner.nextDouble();

        var total = (salary / minimalSalary);
        logger.log(Level.INFO, "Quantidade de salários mínimos: {0} ", total);
    }
}
