import java.util.Scanner;

public class NumMixer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int mix[] = new int[n+n];
        int count = 0;
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if(k>0){
            count = 0;
            for(int i=0; i<n; i++){
                mix[count] =  arr1[i];
                count+=2;
            }
            count = 1;
            for(int j=n-1; j>=0; j--){
                mix[count] =  arr2[j];
                count+=2;
            }
        }
        else{
            count = 1;
            for(int i=0; i<n; i++){
                mix[count] =  arr1[i];
                count+=2;
            }
            count = 0;
            for(int j=n-1; j>=0; j--){
                mix[count] =  arr2[j];
                count+=2;
            }
        }
        for(int o:mix){
            System.out.print(o+" ");
        }
    }
}
