//s1= IQRA
//s2=QRAI

//ANAGRAM

package Anagram;
import java.util.Arrays;
public class AnagramProblem {
    public boolean solve(char[] s1, char[] s2) {
        if (s1.length != s2.length)
            return false;
        else {
            Arrays.sort(s1);
            Arrays.sort(s2);
            for (int i = 0; i < s1.length; i++) {
                if (s1[i] != s2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
