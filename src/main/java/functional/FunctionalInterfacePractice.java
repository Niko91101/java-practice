package functional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacePractice {

    public static void main(String[] args) {

        List<String> names = List.of("Алексей", "Анна", "Борис", "Андрей");

        Predicate<String> isWordStartWithA = s -> s.startsWith("А");

        Function<String, Integer> counterWord = String::length;


        Supplier<String> justPrinting = () -> "Гость";

        Consumer<String> printingName = System.out::println;

        System.out.println(isWordStartWithA.test(names.getFirst()));
        System.out.println(counterWord.apply(names.getFirst()));
        System.out.println(justPrinting.get());
        printingName.accept(names.getFirst());
    }
}
