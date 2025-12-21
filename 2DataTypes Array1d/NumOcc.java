import java.util.Scanner;
public class NumOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int c=0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        for(int i=0; i<n; i++){
            if(find == arr[i]){
                System.out.printf("%d ", i+1);
                c++;
            }
        }
        if(c==0){
            System.out.println("0");
        }
    }
}

