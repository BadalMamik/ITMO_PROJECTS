package Story;

public class PastaFactory extends Places {
    protected String name;
    protected int needFlour = 3;

    public PastaFactory(String name, int numberOfFlour, String status) {
        super(name, numberOfFlour, status);

    }

    void production() {
        // Локальный класс
        class Noodles {
            final protected String productName = "noodles";
        }

        class Pasta {
            final protected String productName = "pasta";
        }
        Noodles noodles = new Noodles();
        Pasta pasta = new Pasta();
        System.out.println("PastaFactory is producing " + noodles.productName + " and " + pasta.productName);

    }

    public int getNeedFlour() {
        return needFlour;
    }

    @Override
    public String toString() {
        return "PastaFactory{" + "name='" + super.name + '\'' + ", numberOfFlour=" + super.numberOfFlour + "}";
    }
}
