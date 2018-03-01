import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int Ispolindrom = 0;

        for (int i=0; i<=str.length()/2 ; i++){
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("Ne polindrom");
                Ispolindrom = 1;
                break;
            }
        }
        if(Ispolindrom == 0){
            System.out.println("Polindrom");
        }
    }
}
