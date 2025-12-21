import java.util.Scanner;

public class CharCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int valC = (int) str.charAt(0); 
        System.out.println(valC);
        sc.close();
    }
}
