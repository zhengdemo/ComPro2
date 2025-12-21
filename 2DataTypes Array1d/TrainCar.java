import java.util.Scanner;

public class TrainCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int p = sc.nextInt();
        int c_train[] = new int[c];
        int p_train[] = new int[p];
        int k = sc.nextInt();
        for(int i=0; i<k; i++){
            int t = sc.nextInt();
            int l = sc.nextInt();
            int v = sc.nextInt();
            l-=1;

            if(t==1){
                if(l<=c-1&&l>=0){
                    if(c_train[l] + v < 51){
                         c_train[l] += v;
                    }
                }
            }
            if(t==2){
                l-=c;
                if(l<=p-1&&l>=0){
                    if(p_train[l] + v < 61){
                         p_train[l] += v;
                    }
                }
            }
            for(int cc = 0; cc<c; cc++){
                System.out.print(c_train[cc]+" ");
            }
            for(int pp = 0; pp<p; pp++){
                System.out.print(p_train[pp]+" ");
            }
            System.out.println();
        }
		sc.close();
    }
}