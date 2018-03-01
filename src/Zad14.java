import java.util.Scanner;

public class Zad14 {
    public static void main(String args[]) {
        int a = 65;
        int z = 90;
        double a1 = (Math.random() + 1) * ((z - a) / 2);
        int b = (int) Math.round(a1 + 65);
        Scanner scanner = new Scanner(System.in);
        Boolean t = true;
        while (t) {
            System.out.println("Введите букву (A..Z)");
            System.out.println("Держу в курсе: ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            char Ch = scanner.next().charAt(0);
            if (b == (int) Ch) {
                System.out.println("Молорик");
                t = false;
            } else {
                if (b - ((int) Ch) > 0)
                    System.out.println("Буква находится правее");
                else
                    System.out.println("Буква левее");
            }
        }
    }
}

