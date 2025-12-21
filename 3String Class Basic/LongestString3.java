import java.util.Scanner;

public class LongestString3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String longest = " "; 
        int maxl = Integer.MIN_VALUE;
        for(int i=0; i<5;i++){
            String str = sc.nextLine();
            int length = str.length();
            if(length>=maxl){
                maxl = length;
                longest = str;
            }
        }
        System.out.println(longest);
        sc.close();
    }
}
