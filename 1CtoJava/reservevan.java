import java.util.Scanner;

public class reservevan {

    public static void main(String[] args) {
        int a=0, b=0, c=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            if(a<=b&&a<=c){
                a+=x;
                System.out.println("A");
            }
            else if(b<=a&&b<=c){
                b+=x;
                System.out.println("B");
            }
            else if(c<=a&&b>c){
                c+=x;
                System.out.println("C");
            }
        }
    }
}