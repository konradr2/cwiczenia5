import java.util.ArrayList;
import java.util.Calendar;

public class Manager extends Employee{
    ArrayList<Goal> goals;
    public Manager(String fname, String lname, String city, String email, String PESEL, int year) {
        super(fname, lname, city, email, PESEL, year);
    }

    public void addGoals(Goal g){
        goals.add(g);

    }
    public boolean isAchivedInCurrentMonth(){
        Calendar currentDate = Calendar.getInstance();
        int currentYear = currentDate.get(Calendar.YEAR);
        int currentMonth = currentDate.get(Calendar.MONTH) + 1;
        return (year == currentYear );
    }

    /*
    public int calculateBonusForGoals(){
        int bonus =0;
        for (Goal goal : goals){
            if(goal.)

        }
        return bonus;
    }

     */

    public int calculateSalary() {
        int salary = 3000;
        for (int i=0; i<(2024-year); i++){
            salary += 1000;
        }

        return salary;


    }
}
