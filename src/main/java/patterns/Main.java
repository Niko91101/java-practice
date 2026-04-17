package patterns;

public class Main {

    public static void main(String[] args) {

        LoggerSingleton logger = LoggerSingleton.getInstance();

        logger.log("User is here!");
        logger.log("User exited");
    }
}
