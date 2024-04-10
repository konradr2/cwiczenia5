import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // developer od technologi bonus
        // tester za kazdy rodzaj testu +300zl
        // manager w goal

        ArrayList<Employee> employees = new ArrayList<>();

        Developer dev = new Developer("John","Doe","New york","john@doe.com","123456789",2020);
        Technology t = new Technology("Java", 800);
        dev.addTechnology(t);
        employees.add(dev);

        Tester tester = new Tester("Jane", "Smith", "Los Angeles", "jane@smith.com","987654321",2021);
        tester.addtestType("UI/UX");
        employees.add(tester);

        Manager manager = new Manager("Bob", "Johnson","Chicago","bob@johnson.com","1122334455",2019);
        Goal g = new Goal(2010,10,15,"Implementing FB logins", 1000);
        manager.addGoals(g);
        employees.add(manager);

        int totalAmount = 0;
        for (Employee employee : employees){
            totalAmount += employee.calculateSalary();
        }

        System.out.println("total amount to be paid this month: " + totalAmount + " USD");

    }
}