import java.util.Scanner;
public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int k = 0;
        while (i != 0) {
            k += i % 10;
            i = i / 10;
        }
        System.out.println((k));
    }
}
