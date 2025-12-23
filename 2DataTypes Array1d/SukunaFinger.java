import java.util.Scanner;

public class SukunaFinger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0, l = 0, r = 0, c = 0;
        while (true) {
            int finger = sc.nextInt();
            if(finger<=0){
                break;
            }
            if (c >= 20) {
                System.out.println("JUBUTSU !");
                j++;
                continue;
            }
            if(finger<100||finger>999){
                System.out.println("JUBUTSU !");
                j++;
                continue;
            }
            int x = finger;
            while(x>=10){
                int temp = 0;
                while(x>0){
                    temp += x%10;
                    x/=10;
                }
                x = temp;
            }
            if(x%2==0){
                r++;
            }
            else{
                l++;
            }
            c++;
        }
        System.out.println("Sukuna's right finger "+r);
        System.out.println("Sukuna's left finger "+l);
        System.out.println("Sukuna's finger "+c);
        System.out.println("jubutsu "+j);
    }
}
