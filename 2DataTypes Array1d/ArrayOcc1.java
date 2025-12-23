import java.util.Scanner;

public class ArrayOcc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        //int occ[] = new int[n];
        int k = sc.nextInt();
        int cp = 0, fa = 0,  fr = 0;
        for(int i=0; i<k; i++){
            int p = sc.nextInt();
            p-=1;
            if(p>=0&&p<n){
                if(arr[p]==0){
                    cp ++;
                }
                else{
                    fr++;
                }
                arr[p]+=1;
            }
            else if(p<0||p>=n){
                fa++;
            }
        }

        System.out.println(cp);
        System.out.println(fa);
        System.out.println(fr);

        int max = -1;
        for(int i:arr){
            if(i>max){
                max = i;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]==max){
                System.out.print((i+1)+" ");
            }
        }
    }
}
