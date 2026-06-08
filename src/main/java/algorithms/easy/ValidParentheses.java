package algorithms.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static boolean isValidParenthses(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}','{');

        for (char c : str.toCharArray()) {
            if (pairs.containsKey(c)) {
                if (deque.isEmpty()) return false;
                char top = deque.pop();
                if (top != pairs.get(c)) return false;
            } else {
                deque.push(c);
            }
        }

        return deque.isEmpty();

    }
}
