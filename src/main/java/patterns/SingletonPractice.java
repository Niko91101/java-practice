package patterns;

public class SingletonPractice {

    private static volatile SingletonPractice instance;

    private SingletonPractice() {}

    public static SingletonPractice getInstance() {
        if (instance == null) {
            synchronized (SingletonPractice.class) {
                if (instance == null) {
                    instance = new SingletonPractice();
                }
            }
        }

        return instance;
    }
}
