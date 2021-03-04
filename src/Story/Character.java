package Story;

public abstract class Character {
    protected String name;
    protected int money;
    protected int numberOfStocks;
    protected float salary;
    protected String status;
    protected long costOfBribery;

    // Workers
    public Character(String name, int money, float salary, String status) {
        this.name = name;
        this.money = money;
        this.salary = salary;
        this.status = status;
    }

    // Spruts
    public Character(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // NewspaperOwners
    public Character(String name, int money, long costOfBribery) {
        this.name = name;
        this.money = money;
        this.costOfBribery = costOfBribery;

    }

    // Miga Julio Neznaika Goat
    public Character(String name) {
        this.name = name;

    }

    // Scooperfield
    public Character(String name, int money, int numberOfStocks, int salary) {
        this.name = name;
        this.money = money;
        this.numberOfStocks = numberOfStocks;
        this.salary = salary;

    }

    public static boolean isNeedStocks() {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getNumberOfStocks() {
        return numberOfStocks;
    }

    public void setNumberOfStocks(int numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public long getCostOfBribery() {
        return costOfBribery;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void appear() {
        System.out.println(getName() + " appears on the stage");

    }


}
