package patterns;

public class Main {

    public static void main(String[] args) {

        SingletonPractice s1 = SingletonPractice.getInstance();
        SingletonPractice s2 = SingletonPractice.getInstance();

        System.out.println(s1 == s2);
    }
}
