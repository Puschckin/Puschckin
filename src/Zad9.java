import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            Boolean b = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if ((i % j) == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
                System.out.print(i + " ");
        }
    }
}