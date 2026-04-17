package streams;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        filterAndSort();
        sumOfEven();
        longestWord();
        listStringToCharArray();
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

    private static void flatList() {
        List<List<String>> sentences = List.of(
                List.of("Привет", "как", "дела"),
                List.of("я", "учу", "Java"),
                List.of("Stream", "API", "круто")
        );

        List<String> flattedList = sentences.stream()
                .flatMap(Collection::stream)
                .toList();

        System.out.println(flattedList);
    }

    private static void listStringToCharArray() {
        List<String> words = List.of(
                "привет", "мир", "java", "стрим"
        );

        List<Character> listChars = words.stream()
                .flatMap(word -> word.chars()
                        .mapToObj(c -> (char) c))
                .toList();

        System.out.println(listChars);
    }

    private static void uniqueNumbers() {
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 3, 4, 5, 5);

        System.out.println(numbers.stream().distinct().toList());
    }

    private static List<Integer> skipAndLimit() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        return numbers.stream()
                .skip(3)
                .limit(4)
                .toList();
    }

    private static Map<Integer, List<String>> groupingByLength() {
        List<String> words = List.of(
                "яблоко", "банан", "апельсин",
                "груша", "киви", "манго", "абрикос"
        );

        return words.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    private static Long countWordsStartingWithA(List<String> names) {

        return names.stream()
                .filter(name -> name.startsWith("А"))
                .count();
    }
}
