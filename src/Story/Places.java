package Story;

public abstract class Places {
    protected String name;
    protected short flourCost;
    protected int numberOfFlour;
    protected String status;
    protected int money;
    protected int numberOfStocks;
    protected int costOfStocks;
// Shop
    public Places(String name, short flourCost) {
        this.name = name;
        this.flourCost = flourCost;
    }
// PastaFactory
    public Places(String name, int numberOfFlour, String status) {
        this.name = name;
        this.numberOfFlour = numberOfFlour;
        this.status = status;
    }
// Barge
    public Places(String name, int money, int numberOfStocks, int costOfStocks) {
        this.name = name;
        this.money = money;
        this.numberOfStocks = numberOfStocks;
        this.costOfStocks = costOfStocks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getFlourCost() {
        return flourCost;
    }

    public void setNumberOfFlour(int numberOfFlour) {
        this.numberOfFlour = numberOfFlour;
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

    public int getCostOfStocks() {       //
        return costOfStocks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}