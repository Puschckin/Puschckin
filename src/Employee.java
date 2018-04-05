
public class Employee extends Object implements Comparable{

    private String LastName;
    private String FirstName;
    private Rank Rank;
    private int salary;

    public Rank getRank(){
        return Rank;
    }

    public String getLastName(){
        return LastName;
    }

    public String getFirstName(){
        return FirstName;
    }


    public int getSalary() {
        return salary;
    }

    public Employee(String LastName, String FirstName, int salary, Rank rank){
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.Rank = rank;
        this.salary = salary;
    }
    public String toString(){
        return LastName + " "+ FirstName + " " +  salary + " " + this.Rank.getName();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee second = (Employee) o;

            if (this.LastName.compareTo(second.getLastName()) == 0){
                return this.salary - second.getSalary();
            }
            else{
                return this.LastName.compareTo(second.getLastName());
            }
        }
        return 1;
    }
}

