import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Salário: ");
        var salary = scanner.nextDouble();

        System.out.printf("Salário mínimo: ");
        var minimalSalary = scanner.nextDouble();

        var total = (salary / minimalSalary);
        System.out.println("Quantidade de salários mínimos: " + total);
    }
}
