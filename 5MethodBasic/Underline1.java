import java.util.Scanner;

public class Underline1 {
    public static void PrintUnderLine() {
        for(int i=0; i<20; i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String name = sc.next();
            System.out.println(name);
            PrintUnderLine();
        }
    sc.close();
    }
}
