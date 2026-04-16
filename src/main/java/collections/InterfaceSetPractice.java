package collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterfaceSetPractice {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 3, 4, 5, 5);

        Set<Integer> set = new HashSet<>(numbers);

        System.out.println(set);
    }
}
