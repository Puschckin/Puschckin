import java.util.Scanner;

public class Zad13 {
    public static void main(String args[]) {
        System.out.println("Введите длинну массива: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double array[] = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = Math.random() * 100;
        }
        Boolean t = true;
        while (t) {
            System.out.println("");
            System.out.println("1: Вывести массив");
            System.out.println("2: Увеличить элемент массива на 10%");
            System.out.println("3: Выход");
            int a = in.nextInt();
            switch (a) {
                case 1:
                    for (int i = 0; i < n; i++)
                        System.out.print(array[i] + " ");
                    break;
                case 2:
                    System.out.println("Введите номер элемента массива: ");
                    int q = in.nextInt();
                    array[q - 1] *= 1.1;
                    break;
                case 3:
                    t = false;
                    break;
            }
        }
    }
}

