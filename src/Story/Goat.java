package Story;

public class Goat extends Character implements ableToGoDown {
    protected String name;

    public Goat(String name) {
        super(name);

    }

    @Override
    public void meAbleToGoDown() {
        System.out.println(super.name + " go down the " + ImageObjects.ROPE.name() + " !");
    }
}