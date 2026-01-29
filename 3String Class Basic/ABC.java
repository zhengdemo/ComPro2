import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int c = 0;
        for(int i=0; i<=str.length()-3; i++){
            int c1 = (int) str.charAt(i);
            int c2 = (int) str.charAt(i+1);
            int c3 = (int) str.charAt(i+2);
            if(c1 + 1 == c2 && c2 + 1 == c3){
                c++;
            }
        }
        sc.close();
        System.out.println(c);
    }
}
