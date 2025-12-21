import java.util.Scanner;

public class NeoGun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0, p = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        int damage[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i=0; i<k; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            x-=1;
            if(x>n-1||x<0){
                System.out.println("Not valid");
            }
            else{
                c++;
                for(int j=x; j>=0; j--){
                    if(y>0){
                        arr[j] -= y;
                        damage[j] += y;
                        if(j!=x){
                            p++;
                        }
                    }
                    y--;
                }

            }
        }
        int code = sc.nextInt();
        if(code == 0){
            for(int i=0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
        }

        if(code == 1){
            for(int i=0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println(c);
            System.out.println(p);
        }

        if(code == 2){
            for(int i=0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            int max = 0;
            for(int i=0; i<n; i++){
                if(damage[i]>=max){
                    max = damage[i];
                }
            }
            for(int i=0; i<n; i++){
                if(damage[i]==max){
                    System.out.print((i+1)+" ");
                }
            }
        }
    }
}
