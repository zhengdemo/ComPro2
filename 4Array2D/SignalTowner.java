import java.util.Scanner;

public class SignalTowner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int map[][] = new int[r][c];
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int rloc = sc.nextInt();
            int cloc = sc.nextInt();
            int str = rloc - 1, stc = cloc - 1;
            int fr = rloc + 1, fc = cloc + 1;
            if(str<0){
                str = 0;
            }
            if(fr>=r){
                fr = r-1;
            }
            if(stc<0){
                stc = 0;
            }
            if(fc>=c){
                fc = c-1;
            }
            for(int row = str; row<=fr; row++){
                for(int col = stc; col<=fc; col++){
                    map[row][col] += 1;
                }
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
