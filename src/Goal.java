import java.util.Calendar;

public class Goal {
    public int year;
    public int amount1;
    public int amount2;
    public String type;
    public int bonus;

    public Goal(int year, int amount1, int amount2, String type, int bonus){
        this.year = year;
        this.amount1 = amount1;
        this.amount2 = amount2;
        this.type = type;
        this.bonus = bonus;
    }

    public boolean isAchivedInCurrentMonth(){
        Calendar currentDate = Calendar.getInstance();
        int currentYear = currentDate.get(Calendar.YEAR);
        return (year == currentYear );
    }

    public int getBonus () {
        return bonus;
    }

}
