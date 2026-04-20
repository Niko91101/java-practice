package collections;

import java.util.*;
import java.util.stream.Collectors;

public class IntarfaceMapPractice {

    public static void main(String[] args) {

    }

    public static Map<Integer, List<String>> groupingByLength(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length));
    }
}
