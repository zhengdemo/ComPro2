import java.util.Scanner;

public class ArrayCompress2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        boolean found = false, sumdata = false;
        for(int i=0; i<n; i++){
            if(arr[i] == a||arr[i] == b||arr[i] == c){
                if(found == false){
                    if(sumdata == true){
                        System.out.print(sum + " ");
                        sum = 0;
                        sumdata = false;
                    }
                    System.out.print(arr[i] + " ");
                    found = true;
                }
            }
            else{
                sum+=arr[i];
                found = false;
                sumdata = true;
            }
        }
        if(sumdata == true){
            System.out.print(sum + " ");
        }
    }
}