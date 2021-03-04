package Story;


public enum ImageObjects {
    CHESTS("Chests", ObjectStatus.EMPTY.getStatus() + " " + ObjectStatus.UNFLAMMABLE.getStatus()),
    CASHBOX("Cashbox", ObjectStatus.OPEN.getStatus() + " " + ObjectStatus.EMPTY.getStatus() + " " + ObjectStatus.UNFLAMMABLE.getStatus()),
    ROPE("Rope", ObjectStatus.ATTACHED.getStatus());
    private final String name;
    private final String status;

    ImageObjects(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public static String objectScene() {
        return ImageObjects.CHESTS + "\n" + ImageObjects.CASHBOX + "\n" + ImageObjects.ROPE;
    }

    @Override
    public String toString() {
        return "ImageObjects{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
