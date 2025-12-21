import java.util.Scanner;

public class lastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int last = x%10;
        System.out.print(last);
    }
}
