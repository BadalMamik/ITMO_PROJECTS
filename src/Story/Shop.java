package Story;

public class Shop extends Places {
    protected String name;

    public Shop(String name, short flourCost) {
        super(name, flourCost);

    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + super.name + '\'' +
                ", flourCost=" + super.flourCost +
                '}';
    }
}
