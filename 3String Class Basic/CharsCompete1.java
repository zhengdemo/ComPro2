import java.util.Scanner;

public class CharsCompete1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        int s = sc.nextInt();
        int t1 = 0, t2 = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c1){
                t1++;
                if(t1 == s){
                    break;
                }
            }
            else if(str.charAt(i) == c2){
                t2++;
                if(t2 == s){
                    break;
                }
            }
        }
        if(t1>t2){
            System.out.println(c1);
            System.out.println(t1+" "+t2);
        }
        else if(t2>t1){
            System.out.println(c2);
            System.out.println(t2+" "+t1);
        }
        else if(t1 == t2){
            System.out.println("draw");
            System.out.println(t1+" "+t2);
        }
    sc.close();
    }
}
