import java.util.Scanner;

public class Sukuna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0, l = 0, r = 0, c = 0;
        int n = sc.nextInt();
        int boxsize[] = new int[n];
        int box[] = new int[n];
        for(int i=0; i<n; i++){
            boxsize[i] = sc.nextInt();
        }

        while (true) {
            int finger = sc.nextInt();
            if(finger<=0){
                break;
            }
            int bp = sc.nextInt();
            bp-=1;
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

            if(bp<0||bp>=n){
                System.out.println("SUKUNA !");
            }
            else if(box[bp]<boxsize[bp]){
                box[bp] += 1;
                System.out.println("OK !");
            }
            else{
                System.out.println("SUKUNA !");
            }
            c++;
        }
        for(int i=0; i<n; i++){
            System.out.println((i+1)+" "+box[i]);
        }
        System.out.println(j);
    }
}
