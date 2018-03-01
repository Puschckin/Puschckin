import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Результат = " + (a/b) + " остаток - " + (a%b));

    }
}
