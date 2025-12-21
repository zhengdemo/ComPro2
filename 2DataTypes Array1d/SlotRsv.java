import java.util.Scanner;

public class SlotRsv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        n+=1;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for(int i=0; i<p; i++){
            int x = sc.nextInt();
            if(arr1[x]<k){
                arr1[x]+=1;
                System.out.println("1");
            }
            else{
                arr2[x]+=1;
                System.out.println("2");
            }
        }
        for(int i=1; i<n; i++){
            System.out.printf("%d ",arr1[i]);
        }
        System.out.printf("\n");
        for(int i=1; i<n; i++){
            System.out.printf("%d ",arr2[i]);
        }
    }
}
