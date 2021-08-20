import java.util.Arrays;

public class Exercicio02 {
    public static void main(String[] args) {
        double average1 =averageCalc(8.0, 9.0, 7.0);
        double average2 = averageCalc(4.0, 5.0, 6.0);
        double sum = average1 + average2;
        double average3 = averageCalc(average1, average2);

        System.out.println("Média dos números 8, 9 e 7: " + average1);
        System.out.println("Média dos números 4, 5 e 6: " + average2);
        System.out.println("Soma as médias anteriores: " + sum);
        System.out.println("Média das médias: " + average3);

    }

    public static Double averageCalc(double ...numbers) {
        double count = Arrays.stream(numbers).sum();
        return count / numbers.length;
    }

}
