import java.util.Scanner;

public class ArrayOcc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        //int occ[] = new int[n];
        int k = sc.nextInt();
        int repzero = 0, lastest = 0;
        for(int i=0; i<k; i++){
            int p = sc.nextInt();
            p-=1;
            if(p>=0&&p<n){
                arr[p]+=1;
            }
        }
        int max = -1;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                repzero++;
            }
            else{
                repzero = 0;
            }
            if(repzero>=max){
                max = repzero;
                lastest = i;
            }
        }
        System.out.println(max);
        repzero = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                repzero++;
                if(repzero==max){
                    System.out.print((i+1)+" ");
                }
            }
            else{
                repzero = 0;
            }
        }
    }
}