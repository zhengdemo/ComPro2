import java.util.Scanner;

public class seclastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>=10){
            x = x/10;
            int last = x%10;
            System.out.print(last);
        }
        else{
            System.out.print("0");
        }
    }
}
