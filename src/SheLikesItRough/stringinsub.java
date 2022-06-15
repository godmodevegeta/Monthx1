package SheLikesItRough;
import java.util.*;

public class stringinsub {
    public static void main(String[] args) {
        String s = "pwwkew";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                // System.out.println(s.substring(i, j));
            }
        }
        Set<String> list = new HashSet();
        
        for (int window = 1; window < s.length(); window++) {
            int start = 0, end = window;
            while (start < s.length() - window) {
                String str = (s.substring(start++, end++));
                if (isUnique(str)) list.add(str);
            }
        }

        System.out.println(list);
    }
    private static boolean isUnique(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) return false;
            else set.add(c);
        }
        return true;
    }
}

