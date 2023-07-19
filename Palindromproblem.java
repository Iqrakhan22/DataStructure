package Palindrom;

public class Palindromproblem {
    public boolean solve(String s){
        String str=s.join(",",s);
//        String str=x.replaceAll("[-+^]*", "");

        System.out.println(str);
        int lowerindex=0;
        int higherindex=s.length()-1;

        while(lowerindex < higherindex){
            if(str.charAt(lowerindex) != str.charAt(higherindex)) {
                return false;
            }
                lowerindex++;
                higherindex--;
        }
        return true;
    }
}
