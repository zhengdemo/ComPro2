import java.util.Scanner;

public class NumReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int pos = sc.nextInt();
            int k = sc.nextInt();
            pos-=1;
            if(arr[pos]>0){
                if(arr[pos]-k<0){
                    arr[pos] = 0;
                }
                else if(arr[pos]-k>=0){
                    arr[pos]-=k;
                }
            }
            for(int j=pos-2; j<pos; j++){
                if(j>=0){
                    if(arr[j]>0){
                        if(arr[j]-k<0){
                            arr[j] = 0;
                        }
                        else if(arr[j]-k>=0){
                            arr[j]-=k;
                        }
                    }
                }
            }
            for(int j=pos+2; j>pos; j--){
                if(j<n){
                    if(arr[j]>0){
                        if(arr[j]-k<0){
                            arr[j] = 0;
                        }
                        else if(arr[j]-k>=0){
                            arr[j]-=k;
                        }
                    }
                }
            }
            for(int p:arr){
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
