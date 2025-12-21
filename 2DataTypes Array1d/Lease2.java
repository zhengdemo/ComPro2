import java.util.Scanner;

public class Lease2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            int x = sc.nextInt(); x-=1;
            arr[i] = x;
        }
        int y = sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i] += y;
        }
        int x = sc.nextInt();
        for(int i=0; i<x; i++){
            int yr = sc.nextInt();
            c = 0;
            for(int j=0; j<n; j++){
                if(arr[j]<yr){
                    System.out.print(j+1 + " ");
                    c++;
                }
                if(j==n-1&&c==0){
                    System.out.print("full");
                    break;
                }
            }
            System.out.println( );
        }
    }
}
