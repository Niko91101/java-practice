package oop.exeption;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException() {
        super("Invalid age range");
    }
}
