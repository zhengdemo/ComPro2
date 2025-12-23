import java.util.Scanner;

public class GetoSuguru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int box[] = new int[n];
        int power[] = new int[n];
        int p = sc.nextInt();
        int sum = 0;
        while(true){
            int g = sc.nextInt();
            if(g%7==0||g%11==0){
                break;
            }
            int bp = sc.nextInt();
                bp-=1;
                if(bp>=n||bp<0){
                    System.out.println("VOMIT");
                }
                else{
                    if(sum+g<=p){
                        power[bp] += g;
                        sum+=g;
                        box[bp] += 1;
                        System.out.println("EAT IT");
                   }
                    else{
                        System.out.println("VOMIT");
                   }
            }
        }
        sum = 0;
        for(int i:power){
            sum+=i;
        }
        System.out.println(sum);
        for(int i=0; i<n; i++){
            System.out.println((i+1)+" "+box[i]+" "+power[i]);
        }
    }
}
