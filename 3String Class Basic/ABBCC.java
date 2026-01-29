import java.util.Scanner;

public class ABBCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int c = 1, maxc =0;
        for(int i=0; i<str.length()-1; i++){
            int c1 = (int) str.charAt(i);
            int c2 = (int) str.charAt(i+1);
            if(c1 == c2 || c1 + 1 == c2){
                c++;
            }
            else{
                c = 1;
            }
            if(c > maxc){
                maxc = c;
            }
        }
        sc.close();
        System.out.println(maxc);
    }
}
