import java.util.Scanner;

public class SimplePoker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int combo = 1, repc = 0, combocount = 0, maxcom = 0;
            int rep[] = new int[2];
            int arr[] = new int[5];
            //
            for(int k=0; k<5; k++){
                arr[k] = sc.nextInt();
            }
            //
            for(int j=0; j<4; j++){
                combo = 1;
                for(int w=j+1; w<5; w++){
                    if(arr[j] == arr[w] && arr[j] != 0){
                        combo++;
                        arr[w] = 0;
                    }
                }
                if(combo>=2){
                    if(combo > maxcom) maxcom = combo;
                    combocount += 1;
                    rep[repc] = arr[j];
                    repc++;
                }
            }
            //System.out.println(combocount);
            //
            if(maxcom == 2 && combocount!=2){
                System.out.printf("One Pair of %d\n", rep[0]);
            }
            if(combocount==2){
                System.out.printf("Two Pair of %d and %d\n", rep[0], rep[1]);
            }
            if(maxcom == 3 && combocount!=2){
                System.out.printf("Triple of %d\n", rep[0]);
            }
            if(maxcom == 4 && combocount!=2){
                System.out.printf("Four of a Kind of %d\n", rep[0]);
            }
            if(maxcom == 0){
                System.out.println("No Combination");
            }
        }
        //System.out.printf("%d %d %d", maxcom, rep[0], combocount);
    }
}
