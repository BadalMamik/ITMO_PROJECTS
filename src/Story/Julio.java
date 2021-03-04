package Story;

public class Julio extends Character implements ableToRun {
    protected String name;

    public Julio(String name) {
        super(name);

    }

    @Override
    public void meAbleToRun() {
        System.out.println(super.name + " escapes!");
    }
}
