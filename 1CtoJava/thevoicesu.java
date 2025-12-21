import java.util.Scanner;

public class thevoicesu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int team1 = 0;
        int team2 = 0;
        int num = 0;
        for(int i=0; i<n; i++){
            int gender = input.nextInt();
            int sc1 = input.nextInt();
            int sc2 = input.nextInt();
            num++;
            if(gender == 1){
                if(sc1 >= 9 && team1 < k){
                    team1++;
                    System.out.printf("%d 1\n", num);
                }
                else if(team2 < k && sc2 >= 9){
                    team2++;
                    System.out.printf("%d 2\n", num);
                }
            }
            else{
                if(sc2 >= 9 && team2 < k){
                    team2++;
                    System.out.printf("%d 2\n", i+1);
                }
                else if(team1 < k && sc1 >= 9){
                    team1++;
                    System.out.printf("%d 1\n", i+1);
                }
            }
        }
        
    }
}
