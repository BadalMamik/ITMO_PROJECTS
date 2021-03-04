package Story;

public enum PlaceStatus {
    WORKING("working"),
    STOPPED("stopped");
    private final String status;

    PlaceStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
