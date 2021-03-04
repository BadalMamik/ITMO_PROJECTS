package Story;


public class Spruts extends Character {
    protected String name;

    public Spruts(String name, int money) {
        super(name, money);

    }

    public void newspaperBribery(long costOfBribery) {

        System.out.println("Cost of bribery: " + costOfBribery);
        setMoney(getMoney() - (int) costOfBribery);
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Spruts has " + getMoney() + " money";
    }


}
