import java.util.Scanner;

public class Exercicio01 {

    static class Time {

        public static Integer fromYears(int years) {
            return years * 365;
        }

        public static Integer fromMonths(int months) {
            return months * 30;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Anos: ");
        var years = scanner.nextInt();

        System.out.printf("Meses: ");
        var months = scanner.nextInt();

        System.out.printf("Dias: ");
        var days = scanner.nextInt();

        var total = Time.fromMonths(months) + Time.fromYears(years) + days;
        System.out.println("Total em dias: " + total);
    }



}
