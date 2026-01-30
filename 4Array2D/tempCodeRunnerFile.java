import java.util.Scanner;

public class NumTable1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        boolean ln = false;
        int prt = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int fr = sc.nextInt();
            int fc = sc.nextInt();
            fr-=1; fc-=1;
            if(fr < 0 || fr >= r || fc < 0 || fc >= c){
                if(!ln){
                    System.out.println();
                    ln = true;
                }
                prt = Integer.MIN_VALUE;
            }
            else{
                ln = false;
                if(arr[fr][fc] == prt){
                    System.out.print("*");
                }
                else{
                    prt = arr[fr][fc];
                    System.out.print(prt);
                }
            }
        }
        sc.close();
    }
}
 