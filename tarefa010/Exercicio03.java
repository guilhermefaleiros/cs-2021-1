import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio03 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var logger = Logger.getLogger("Exercicio03");

        logger.log(Level.INFO, "Valor: ");
        var value = scanner.nextDouble();
        var readjustValue = applyPercentual(value, 15.0);

        logger.log(Level.INFO, "Valor reajustado: {0} ", readjustValue);
    }

    // Método que aplica determinado percentual a um certo valor fornecido
    public static double applyPercentual(double value, double percent) {
        return  value + ((value / 100) * percent);
    }
}
