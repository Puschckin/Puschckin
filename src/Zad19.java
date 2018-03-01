import java.util.Scanner;

public class Zad19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k;
        int l;
        int h;
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (a < b) {
                k = a;
                l = b;
            } else {
                k = b;
                l = a;
            }
            if (l < c) {
                h = c;
            } else {
                h = l;
                l = c;
            }
            int T1 = h^2;
            int T2 = k^2 + l^2;
            if (T1 == T2)
                System.out.println("Прямоугольный");
            else if (T1 < T2)
                System.out.println("Остроугольный");
            else if (T1 > T2)
                System.out.println("Тупоугольный");
        }
        else
            System.out.println("Треугольника не существует");

    }

}
