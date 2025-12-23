import java.util.Scanner;

public class RyomenSukuna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int boxcapa[] = new int[n];
        int boxstor[] = new int[n];
        int boxc[] = new int[n];
        int boxs[] = new int[n];
        int l=0,r=0,j=0,c=0;
        for(int i=0; i<n; i++){
            boxcapa[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            boxstor[i] = sc.nextInt();
        }

        while(true){
            int power = sc.nextInt();
            if(power<=0){
                break;
            }
            int p = sc.nextInt();
            p-=1;
            if (power<100||power>999||c >= 20) {
                System.out.println("JUBUTSU !");
                j++;
                continue;
            }
            if(p<0||p>=n){
                System.out.println("SUKUNA !");
            }
            else{
                c++;
                int x = power;
                while(x>=10){
                    int sum = 0;
                    while(x>0){
                        sum+=x%10;
                        x/=10;
                    }
                    x = sum;
                }
                if(x%2==0){
                    r++;
                }
                else{
                    l++;
                }
                if(boxs[p]+power > boxstor[p] || boxc[p]+1 > boxcapa[p]){
                    System.out.println("SUKUNA !");
                }
                else{
                    System.out.println("KO !");
                    boxs[p] += power;
                    boxc[p] += 1;
                    
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println((i+1)+" "+boxc[i]+" "+boxs[i]);
        }
        System.out.println("Sukuna's right finger "+r);
        System.out.println("Sukuna's left finger "+l);
        System.out.println("Sukuna's finger "+c);
        System.out.println("jubutsu "+j);
    }
}
