package streams;

import java.util.Comparator;
import java.util.List;

public class StreamPractice {

    public static void main(String[] args) {

        filterAndSort();
        sumOfEven();
        longestWord();
    }

    private static void filterAndSort() {
        List<String> names = List.of(
                "Алексей", "Анна", "Борис",
                "Андрей", "Виктор", "Алина"
        );

        List<String> sortedNamesStartedWithA = names.stream()
                .filter(name -> name.startsWith("А"))
                .sorted()
                .toList();

        System.out.println(sortedNamesStartedWithA);
    }

    private static void sumOfEven() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // твоё решение
        int sum = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }

    private static void longestWord() {
        List<String> words = List.of(
                "яблоко", "банан", "апельсин",
                "груша", "киви", "манго"
        );
        // твоё решение

        String longestWord = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElseThrow(() -> new IllegalArgumentException("Пустой список"));

        System.out.println(longestWord);
    }
}
