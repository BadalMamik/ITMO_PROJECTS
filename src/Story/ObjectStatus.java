package Story;

public enum ObjectStatus {
    UNFLAMMABLE("unflammable"),
    EMPTY("empty"),
    OPEN("open"),
    ATTACHED("attached to the window sill");
    private final String status;

    ObjectStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
