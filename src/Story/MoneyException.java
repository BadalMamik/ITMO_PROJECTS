package Story;
// Checked exception
public class MoneyException extends Exception {
    public MoneyException(String message){
        System.err.println(message);
    }
}
