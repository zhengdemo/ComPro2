import java.util.Scanner;

public class CropAround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int lookR = sc.nextInt();
        int lookC = sc.nextInt();
        int CrR = sc.nextInt();
        int Crc = sc.nextInt();
        if(lookR < 0 || lookR >= r || lookC < 0 || lookC >= c){
            System.out.println("invalid");
        }
        else{
            int StPosR = (CrR)/2;
            int StPosC = (Crc)/2;
            for(int i = lookR - StPosR; i <= lookR + StPosR; i++){
                for (int j = lookC - StPosC; j <= lookC + StPosC; j++) {
                    if(i >= r || j >= c){
                        continue;
                    }
                    else{
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
