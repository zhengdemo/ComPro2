import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> arr = new ArrayList<int[]>();
        int n = sc.nextInt();
        int sum = 0, out = 0, max = -999, min = 999;
        for(int i=0; i<n; i++){
            int k = sc.nextInt();
            int []aforadd = new int[k];
            for(int j = 0 ; j<k; j++){
                aforadd[j] = sc.nextInt();
            }
            arr.add(aforadd);
        }
        while (true) {
            int aloc = sc.nextInt();
            if(aloc == 0){
                break;
            }
            aloc-=1;
            int index = sc.nextInt();
            if(aloc < 0 || aloc >= n || index < 0 || index >= arr.get(aloc).length){
                out ++;
            }
            else{
                sum += arr.get(aloc)[index];
                if(arr.get(aloc)[index] > max){
                    max = arr.get(aloc)[index];
                }
                if(arr.get(aloc)[index] < min){
                    min = arr.get(aloc)[index];
                }
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(out);
    }
}
