package SheLikesItRough;

import java.util.HashMap;

public class MinimumWindow {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        int sn = s.length(), tn = t.length();
        for (int i = 0; i < sn; i++) {
            for (int j = i + 1; j <= sn; j++) {
                System.out.println(s.substring(i, j));
            }
        }

    }

    public static boolean containsT(String s, String t) {
        return true;
    }
}
