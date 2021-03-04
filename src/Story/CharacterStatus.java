package Story;

public enum CharacterStatus {
    WORKING("working"),
    STOPPED("stopped working"),
    HUNGRY("hungry"),
    OUTRAGED("outraged");
    private final String status;

    CharacterStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
