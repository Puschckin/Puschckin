import java.util.Random;
import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Random random = new Random();
        int num = a + random.nextInt(b - a);
        System.out.println(num);
    }
}
