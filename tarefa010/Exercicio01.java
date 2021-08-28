import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio01 {

    static class Time {

        private Time(){}

        /*
            @param years
        */

        public static Integer fromYears(int years) {
            return years * 365;
        }

        /*
            @param months
        */

        public static Integer fromMonths(int months) {
            return months * 30;
        }
    }

    /*
        Classe principal para teste da Classe Time
    */

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var logger = Logger.getLogger("Exercicio01");

        logger.log(Level.INFO, "Anos: ");
        var years = scanner.nextInt();

        logger.log(Level.INFO, "Meses: ");
        var months = scanner.nextInt();

        logger.log(Level.INFO, "Dias: ");
        var days = scanner.nextInt();

        var total = Time.fromMonths(months) + Time.fromYears(years) + days;
        logger.log(Level.INFO, "Total em dias: {0}", total);
    }

}
