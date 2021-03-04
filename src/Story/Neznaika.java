package Story;

public class Neznaika extends Character implements ableToGoDown {
    protected String name;

    public Neznaika(String name) {
        super(name);
    }

    @Override
    public void meAbleToGoDown() {
        System.out.println(super.name + " go down the " + ImageObjects.ROPE.name() + " !");
    }
}
