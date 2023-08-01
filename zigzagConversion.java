//  I        A        H
//  Q     H  H     K  A
//  R  S     R  S     N
//  A        I

//ANS = I A H Q H H K A R S R S N A I

//  I        I        A
//  Q     A  F     M  N
//  R  S     R  H
//  A        A

//  I I A Q A F M N R S R H A A

package app;

public class zigzagConversion {
    public static String ZigZag(String str, int noRow){
        if (noRow == 1){
            return str;
        }
        else {
            String result = "";
            int jump = 2 * noRow - 2;
            for (int i=0; i < noRow;i++) {
                for (int j = i; j < str.length(); j = j + jump) {
                    result = result + str.charAt(j);
                    if (i >= 1 && i <= noRow - 2 && j + (jump - 2 * i) < str.length()) {
                        result = result + str.charAt(j + jump - 2 * i);
                    }
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        String s = "IqraSaifRahman";
        int numberRows = 4;
        System.out.println(ZigZag(s,numberRows));

    }
}
