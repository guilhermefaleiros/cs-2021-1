import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio02 {
    public static void main(String[] args) {
        var logger = Logger.getLogger("Exercicio02");

        double average1 =averageCalc(8.0, 9.0, 7.0);
        double average2 = averageCalc(4.0, 5.0, 6.0);
        double sum = average1 + average2;
        double average3 = averageCalc(average1, average2);

        logger.log(Level.INFO, "Média dos números 8, 9 e 7: {0}", average1);
        logger.log(Level.INFO, "Média dos números 4, 5 e 6: {0}", average2);
        logger.log(Level.INFO, "Soma as médias anteriores: {0}", sum);
        logger.log(Level.INFO, "Média das médias: {0} ", average3);
    }

    public static Double averageCalc(double ...numbers) {
        double count = Arrays.stream(numbers).sum();
        return count / numbers.length;
    }

}
