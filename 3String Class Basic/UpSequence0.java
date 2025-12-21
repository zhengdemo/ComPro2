import java.util.Scanner;

public class UpSequence0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            if(arr[i]>=arr[i+1]){
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[n-1]);
        sc.close();
    }
}
