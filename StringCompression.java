package app;

public class StringCounting {
    public static void main(String[] args) {
        String str="aaaaaaaabbcccddddeef";
        int size = str.length();
        int count =1,j;
        for (int i=0;i<size;i++){
            j=i+1;
            if (str.charAt(i) == str.charAt(j)) {
                count++;
            }
            else {
                if (count != 1){
                    System.out.print(str.charAt(i) + "" + count);
                }
                else{
                    System.out.print(str.charAt(i));
                }
                i = j;
                count=1;
            }
        }
//            if (count != 1){
//                System.out.print(str.charAt(i) + "" + count);
//            }
//            else{
//                System.out.print(str.charAt(i));
//            }

    }
}
