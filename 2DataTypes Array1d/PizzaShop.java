import java.util.Scanner;

public class PizzaShop {
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
        int co = 0, k =0;
        int sum = 0;
        while(co<n){
            sum=0;
            for(int i=k; i<a+co; i++){
                k++;
                if(i<n){
                    sum+=arr[i];
                }
                else{
                    break;
                }
            }
            if(sum>0){
                System.out.print(sum+" ");
            }
            sum=0;
            for(int i=k; i<b+a+co; i++){
                k++;
                if(i<n){
                    sum+=arr[i];
                }
                else{
                    break;
                }
            }
            if(sum>0){
                System.out.print(sum+" ");
            }
            sum=0;
            for(int i=k; i<c+b+a+co; i++){
                k++;
                if(i<n){
                    sum+=arr[i];
                }
                else{
                    break;
                }
            }
            if(sum>0){
                System.out.print(sum+" ");
            }
            co=k;
        }
        sc.close();
    }
}
