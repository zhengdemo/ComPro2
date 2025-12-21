import java.util.Scanner;

public class LongestCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxl = Integer.MIN_VALUE;
        int c = 0;
        while (true) {
            String str = sc.nextLine();
            int length = str.length();
            if(str.isEmpty()){
                break;
            }
            if(length>maxl){
                c=0;
                maxl = length;
            }
            if(length==maxl){
                c++;
            }
        }
        System.out.println(maxl+"\n"+c);
        sc.close();
    }
}
