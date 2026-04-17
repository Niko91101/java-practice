package patterns;

public class LoggerSingleton {
    private volatile static LoggerSingleton instance;

    private LoggerSingleton() {
    }

    public static LoggerSingleton getInstance() {
        if (instance == null) {
            synchronized (LoggerSingleton.class) {
                if (instance == null) {
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(System.currentTimeMillis() + " " + message);
    }
}
