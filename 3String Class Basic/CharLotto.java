import java.util.Scanner;

public class CharLotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lotto[] = new String[12];
        String pr[] = new String[6];
        int lotwin[] = new int[6];
        int sum = 0;
        for(int i=0; i<12; i++){
            lotto[i] = sc.next();
        }
        for(int i=0; i<6; i++){
            pr[i] = sc.next();
        }
        for(int i=0; i<12; i++){
            for(int j=0; j<6; j++){
                if(lotto[i].equals(pr[j])){
                    lotwin[j] += 1;
                }
            }
        }
        for(int i : lotwin){
            sum+=i;
        }
        for(int i : lotwin){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
