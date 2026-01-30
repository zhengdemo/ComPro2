import java.util.Scanner;

public class UnderlineParamiter {
    public static void PrintUnderLine(int n) {
        for(int i=0; i<n; i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String name = sc.next();
            int k = sc.nextInt();
            System.out.println(name);
            PrintUnderLine(k);
        }
    sc.close();
    }
}
