import java.util.ArrayList;

public class Tester extends Employee{
    private ArrayList<String> testTypes;
    public Tester(String fname, String lname, String city, String email, String PESEL, int year) {
        super(fname, lname, city, email, PESEL, year);
        testTypes = new ArrayList<>();
    }

    public void addtestType(String testType){
        testTypes.add(testType);
    }
    public int calculateBonusForTypes(){
        int bonus = testTypes.size() * 300;

        return bonus;
    }

    @Override
    public int calculateSalary() {
        int salary = 3000;
        for (int i=0; i<(2024-year); i++){
            salary += 1000;
        }
        int bonus = calculateBonusForTypes();

        return salary + bonus;


    }
}
