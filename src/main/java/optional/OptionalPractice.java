package optional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OptionalPractice {

    public static void main(String[] args) {

        Map<String, String> config = Map.of(
                "host", "localhost",
                "port", "8080"
        );

        Optional<Integer> key =
    }

    private static String getDefaultUser() {
        System.out.println("Запрос в БД....");
        return "Гость";
    }

    private static String getValue(Map<String, String> config, String key) {

        Optional<String> tryValue = Optional.ofNullable(config.get(key));

        return tryValue.orElse("не задано");
    }

    private static String getNameStartWithA(List<String> listOfNames) {

        return listOfNames.stream()
                .filter(name -> name.startsWith("А"))
                .findFirst()
                .map(String::toUpperCase)
                .orElse("Не найдено");
    }

}