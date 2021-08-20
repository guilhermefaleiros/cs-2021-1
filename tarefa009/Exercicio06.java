import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Número: ");
        var number = scanner.nextInt();

        var successor = number + 1;
        var predecessor = number - 1;

        System.out.println("Sucessor: " + successor);
        System.out.println("Antecessor: " + predecessor);
    }
}
