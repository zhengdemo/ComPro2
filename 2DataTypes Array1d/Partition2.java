import java.util.Scanner;

public class Partition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        for(int i=0; i<n; i++){
         arr[i] = sc.nextInt();
        }
        int half = n/2, k = 0;
        half = arr[half];
        for(int i=0; i<n; i++){
            if(arr[i]<=half){
                arr2[k] = arr[i];
                k++;
            }
        }
        half = k/2;
        half = arr2[half];
        for(int i=0; i<k; i++){
            if(arr2[i]<=half){
                System.out.printf("%d ", arr2[i]);
            }
        }
        System.out.printf("\n");
         for(int i=0; i<k; i++){
            if(arr2[i]>half){
                System.out.printf("%d ", arr2[i]);
            }
        }
    }
}
