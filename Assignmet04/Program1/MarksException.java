package Assignmet04.Program1;

public class MarksException extends RuntimeException {
    String ErrorMessage;

    public MarksException(){
        ErrorMessage = null;
    }
    public MarksException(String message){
        this.ErrorMessage = message;
    }

    public void display(){
        System.out.println(ErrorMessage);
    }
}
