import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean[][] days = new boolean[7][2]; // 7 дней 1 - будний день 1 - отпуск

        //понедельник
        days[0][0] = true; // будний день
        days[0][1] = false; // отпуск
        //вторник
        days[1][0] = true; // будний день
        days[1][1] = false; // отпуск
        //среда
        days[2][0] = true; // будний день
        days[2][1] = true; // отпуск
        //четверг
        days[3][0] = true; // будний день
        days[3][1] = false; // отпуск
        //пятница
        days[4][0] = true; // будний день
        days[4][1] = false; // отпуск
        //сб
        days[5][0] = false; // выходной день
        days[5][1] = false; // отпуск
        //вс
        days[6][0] = false; // выходной день
        days[6][1] = false; // отпуск

        int i = scanner.nextInt();
        if(days[i-1][0]) {
            if (days[i - 1][1])
                System.out.println("true");
            else System.out.println("false");
        }
        else System.out.println("true");
    }

}
