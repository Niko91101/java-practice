package oop.exeption;

public class ExeptionPractice {

    public static void main(String[] args) {
        
        int result = 0;


        try {
            setAge(-1);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int num1, int num2) {
        
        if (num2 == 0) {
            throw new InvalidAgeException();
        }
        
        return num1 / num2;
    }

    private static void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException();
        }
    }
}
