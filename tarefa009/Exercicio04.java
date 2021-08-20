import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("IPI: ");
        var ipi = scanner.nextDouble();

        System.out.printf("Código peça 1: ");
        var cod1 = scanner.next();

        System.out.printf("Valor unitário peça 1: ");
        var value1 = scanner.nextDouble();

        System.out.printf("Quantidade de peças 1: ");
        var units1 = scanner.nextInt();

        System.out.printf("Código peça 2: ");
        var cod2 = scanner.next();

        System.out.printf("Valor unitário peça 2: ");
        var value2 = scanner.nextDouble();

        System.out.printf("Quantidade de peças 2: ");
        var units2 = scanner.nextInt();

        var total = calculateTotal(ipi, units1, value1, units2, value2);
        System.out.println("Total: R$" + total);
    }

    public static double calculateTotal(double ipi, int units1, double value1, int units2, double value2) {
        System.out.println(((ipi / 100) + 1));
      return ((units1 * value1) + (units2 * value2)) * ((ipi / 100) + 1);
    }
}
