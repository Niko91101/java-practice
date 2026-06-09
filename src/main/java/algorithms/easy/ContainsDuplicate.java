package algorithms.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] arr) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (Integer i : arr) {
            if (!uniqueNumbers.add(i)) {
                return true;
            }
        }
        return false;
    }
}
