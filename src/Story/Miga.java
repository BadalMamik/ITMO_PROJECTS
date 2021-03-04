package Story;

public class Miga extends Character implements ableToRun {
    protected String name;

    public Miga(String name) {
        super(name);

    }

    @Override
    public void meAbleToRun() {
        System.out.println(super.name + " escapes!");
    }
}

