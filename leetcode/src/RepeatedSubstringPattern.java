/**
 * https://leetcode.com/problems/repeated-substring-pattern/
 * Created by pankaj on 17/11/16.
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String str) {
        int N = str.length();
        for (int d = 1; d <= N / 2; d++) { // logN divisors?
            if (N % d == 0 && check(str, d)) return true;
        }
        return false;
    }

    private boolean check(String str, int d) {
        for (int i = 0, j = 0; i < str.length(); i++, j = (j + 1) % d) {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }
}
