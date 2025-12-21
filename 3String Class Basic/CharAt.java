import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        n-=1;
        if(n<0||n>=str.length()){
            System.out.println("invalid position");
        }
        else{
            System.out.println(str.charAt(n));
        }
        sc.close();
    }
}
