package Exception;

public class itemException extends RuntimeException {
    private String ErrorMessage;
    private int quantity;

    public itemException(String errorMessage, int quantity) {
        ErrorMessage = errorMessage;
        this.quantity = quantity;
    }
    
    public void display(){
        System.out.println(quantity + ErrorMessage);
    }
}
