import java.util.Scanner;

public class UpLowCaseChar0 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        String s1 = sc.next(); 
        int up = 0, low = 0, a = 0;
        for(int i=0;i < s1.length(); i++){
            char c1 = s1.charAt(i);
            if(Character.isAlphabetic(c1)){
                if(Character.isUpperCase(c1)){
                    System.out.print("1");
                    up++;
                }
                else{
                    System.out.print("0");
                    low++;
                }
            }
            else{
                System.out.print("2");
                a++;
            }
        }
        System.out.println();
        System.out.println(low);
        System.out.println(up);
        System.out.println(a);
        sc.close();
    }
}
