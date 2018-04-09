
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
            if (office.find(rank).size() != 0) {
                for (Employee employee : office.find(rank)) {
                    System.out.println(employee);
                }
            } else System.out.println("Нет должности в списке");
        }
    }

    public static void sort1() {
        office.sort();
        office.showEmployeeList();
    }

    public static void main(String[] args) {
        System.out.println("Введите команду");
        Boolean P = true;
        while (P) {
            System.out.println("1: Заполнить список сотрудников");
            System.out.println("2: Вывести сотрудников");
            System.out.println("3: Отсортировать и вывести");
            System.out.println("4: Поиск по должности ");
            System.out.println("5: Выход ");
            String command = in.next();
            switch (command) {
                case "1":
                    System.out.println("Укажите число сотрудников. Введите фамилию работника, имя, зарплату и должность ");
                    fill();
                    break;
                case "2":
                    outInfo();
                    break;
                case "3":
                    sort1();
                    break;
                case "4":
                    System.out.println("Введите должность ");
                    find();
                    break;

                case "5":
                    P = false;
                    break;
            }

        }
    }
}
