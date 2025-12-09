package LabAssignment02.Program01;

public class HospitalException extends RuntimeException {
    String ErrorMessage;

    public HospitalException(String errorMessage) {
        ErrorMessage = errorMessage;
    }

    public void display(){
        System.out.println(ErrorMessage);
    }
} 
