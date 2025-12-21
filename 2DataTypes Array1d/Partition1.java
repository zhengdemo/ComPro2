import java.util.Scanner;

public class Partition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
         arr[i] = sc.nextInt();
        }
        int half = n/2;
        half = arr[half];
        for(int i=0; i<n; i++){
            if(arr[i]<=half){
                System.out.printf("%d ", arr[i]);
            }
        }
        System.out.printf("\n");
         for(int i=0; i<n; i++){
            if(arr[i]>half){
                System.out.printf("%d ", arr[i]);
            }
        }
    }
}
