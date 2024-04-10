import java.util.Date;
public class Employee {


    public String fname;
    public String lname;
    public String city;
    public String email;
    public String PESEL;
    public int year;

    public Employee(String fname, String lname, String city, String email, String PESEL, int year ){
        this.fname = fname;
        this.lname =lname;
        this.city = city;
        this.email = email;
        this.PESEL = PESEL;
        this.year = year;

    }

    public int calculateSalary() {
        int salary = 3000;
        for (int i=0; i<(2024-year); i++){
            salary += 1000;
        }

        return salary;


    }

}
