import java.util.ArrayList;

public class Developer extends Employee{
    ArrayList<Technology> technologies;

    public Developer(String fname, String lname, String city, String email, String PESEL, int year) {
        super(fname, lname, city, email, PESEL, year);
    }

    public void addTechnology(Technology t){
        technologies.add(t);

    }
    public int calculateBonusForTechnology(){
        int bonus = 0;
        for (Technology technology: technologies)
            bonus += technology.getBonusAmount();
        return bonus;
    }



    public int calculateSalary() {
        int salary = 3000;
        for (int i=0; i<(2024-year); i++){
            salary += 1000;
        }
        int bonus = calculateBonusForTechnology();


        return salary + bonus;


    }
}
