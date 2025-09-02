package Unit1;

public class insufficientBalanceException extends RuntimeException {
    public insufficientBalanceException(String message){
        super(message);
    }
}