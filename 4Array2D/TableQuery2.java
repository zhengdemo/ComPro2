import java.util.Scanner;

public class TableQuery2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] table = new int[r][c]; 

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                table[i][j] = sc.nextInt();
            }
        }
        int a = sc.nextInt()-1;
        int b = sc.nextInt()-1;
        int p = sc.nextInt()-1;
        int q = sc.nextInt()-1;
        if(a < 0){
            a = 0;
        }
        if(b >= r){
            b = r-1;
        }
        if(p < 0){
            p = 0;
        }
        if(q >= c){
            q = c-1;
        }
        for (int i = a; i <= b; i++) {
            for(int j = p; j <= q; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
