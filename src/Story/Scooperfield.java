package Story;

import java.util.Objects;

public class Scooperfield extends Character {
    protected String name;
    protected int money = 0;
    protected int numberOfStocks;
    protected int randNum;
    protected int resCost;


    public Scooperfield(String name, int money, int numberOfStocks, int salary) {
        super(name, money, numberOfStocks, salary);
    }


    public void buyStocks(int numberOfStocks, int costOfStocks) {

        int min = 80;
        randNum = min + (int) (Math.random() * (((numberOfStocks - 5) - min) + 1));
        resCost = randNum * costOfStocks;
        System.out.println("Scooperfield Bought " + randNum + " for the amount of " + resCost + " fertings");
        setMoney(getMoney() - resCost);
        setNumberOfStocks(getNumberOfStocks() + randNum);
        System.out.println(toString());

    }

    public int getRandNum() {
        return randNum;
    }

    public int getResCost() {
        return resCost;
    }

    public float salaryReduction(float salary) {
        System.out.println("Scooperfield reduced salary of workers to half ferting");
        return salary / 2;
    }

    public int buyFlour(short cost, int need) {

        System.out.println("Pasta Factory need " + need + " flour." + " Scooperfield has " + getMoney() + " fertings");
        int resFlourCost = cost * need;
        System.out.println("Scooperfield buys flour");
        setMoney(getMoney() - resFlourCost);
        System.out.println(toString());

        return need;
    }

    @Override
    public String toString() {
        return "Scooperfield{" +
                "name='" + super.name + '\'' +
                ", money=" + super.money +
                ", numberOfStocks=" + super.numberOfStocks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scooperfield that = (Scooperfield) o;
        return money == that.money && numberOfStocks == that.numberOfStocks && randNum == that.randNum && resCost == that.resCost && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, numberOfStocks, randNum, resCost);
    }

    public boolean isWantToUpSalary() {
        return false;
    }

    public void doSmth() {
        System.out.println("nothing");
    }
}
