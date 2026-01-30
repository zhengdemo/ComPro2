import java.util.Scanner;

public class Triple {
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
        int v = sc.nextInt();
        for(int i=0; i<r; i++){
            int count = 0;
            boolean tri = false;
            for(int j=0; j<c; j++){
                if(arr[i][j] == v){
                    count++;
                    if(count == 3){
                        tri = true;
                        break;
                    }
                }
                else{
                    count = 0;
                }
            }
            if(tri){
                System.out.print((i+1) + " ");
            }
        }
        sc.close();
    }
}
