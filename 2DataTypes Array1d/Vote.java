import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int pe=0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<k; i++){
            int vote = sc.nextInt();
            arr[vote-1] += 1;
        }
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                pe = i+1;
                max = arr[i];
            }
        }
        System.out.printf("%d\n%d", pe, max);
    }
}
