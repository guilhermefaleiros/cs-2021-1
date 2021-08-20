import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Valor: ");
        var value = scanner.nextDouble();
        var readjustValue = applyPercentual(value, 15.0);

        System.out.println("Valor reajustado: " + readjustValue);
    }

    public static double applyPercentual(double value, double percent) {
        return  value + ((value / 100) * percent);
    }
}
