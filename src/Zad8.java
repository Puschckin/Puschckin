import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Boolean b = false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                b = true;
                break;
            }
        }
        if (b)
            System.out.println(" не простое ");
        else
            System.out.println(" простое ");

    }
}
