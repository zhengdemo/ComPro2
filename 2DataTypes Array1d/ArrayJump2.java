import java.util.Scanner;

public class ArrayJump2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int cjump = 0,  k = 0; 
        int start = sc.nextInt();
        for(int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        k = start-1;
        while(true){
            if(k<n){
                System.out.println((k+1)+" " +arr[k]);
                k+=arr[k];
            }
            else{
                System.out.println("out of bounds");
                break;
            }
        }
    }
}
