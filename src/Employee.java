
public class Employee {
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
        return LastName + " "+ FirstName + " " +  salary + " " + Rank;
    }


}

