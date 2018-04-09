
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static Office office = new Office();

    public static void fill() {
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            Employee employee = new Employee(in.next(), in.next(), in.nextInt(), Rank.valueOf(in.next()));
            office.add(employee);
        }
    }

    public static void outInfo() {
        office.showEmployeeList();
    }

    public static void find() {
        String rankName = in.next();
        Rank rank = Rank.getRank(rankName);
        if (rank == null) {
            System.out.println("Неизвестная должность " + rankName);
        } else {
            for (Employee employee : office.find(rank)) {
                System.out.println(employee);
            }
        }
    }
    public static void sort1(){
        office.sort();
        office.showEmployeeList();
    }

    public static void main (String[]args){
        System.out.println("Введите команду");
        String command = in.next();
        if (command.equals("fill")) {
            fill();
            //outInfo();
            sort1();
        }
        find();



        }

    }
