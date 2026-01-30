import java.util.Scanner;

public class TableQuery1 {
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
        int t = sc.nextInt();
        int q = sc.nextInt()-1;
        if(q<0){
            System.out.println("invalid Q");
        }
        else{
            if(t==1){
                if(q>=r){
                    System.out.println("invalid Q");
                }
                else{
                    for(int i=q; i<=q; i++){
                        for(int j=0; j<c; j++){
                            System.out.print(table[i][j] + " ");
                        }
                    }
                }
            }
            else if(t==2){
                if(q>=c){
                    System.out.println("invalid Q");
                }
                else{
                    for(int i=0; i<r; i++){
                        for(int j=q; j<=q; j++){
                            System.out.println(table[i][j]);
                        }
                    }
                }
            }
        }
    }
}
