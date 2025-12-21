import java.util.Scanner;

public class LongestString4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String longest = " "; 
        int maxl = Integer.MIN_VALUE;
        while (true) {
            String str = sc.nextLine();
            int length = str.length();
            if(str.isEmpty()){
                break;
            }
            if(length>=maxl){
                maxl = length;
                longest = str;
            }
        }
        System.out.println(longest);
        sc.close();
    }
}
