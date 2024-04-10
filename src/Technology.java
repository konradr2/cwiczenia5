public class Technology {

    public String nameOfTechnology;
    public int amount;

    public Technology(String nameOfTechnology, int amount){
        this.nameOfTechnology = nameOfTechnology;
        this.amount = amount;
    }
    public int getBonusAmount(){
        return amount;
    }
}
