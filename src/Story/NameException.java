package Story;
// Unchecked exception
public class NameException extends RuntimeException {
    public NameException(String message){
        System.err.println(message);
    }
}
