package patterns;

public class Main {

    public static void main(String[] args) {

        User user = new User.Builder()
                .name("Stas")
                .age(20)
                .email("mez2")
                .build();

        System.out.println(user.toString());

    }
}
