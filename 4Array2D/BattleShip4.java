import java.util.Scanner;

public class BattleShip4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int map[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        int firsl = -1,  winl = 0, allship = 0,shot = 0, sfail = 0, sfail_rep = 0, shot_rep = 0, out = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               if(map[i][j] == 1){
                allship++;
               }
            }
        }
        //System.out.println(allship);
        boolean attacker = false;
        for (int i = 0; i < n; i++) {
            int lor = sc.nextInt()-1;
            int loc = sc.nextInt()-1;
            if(lor < 0 || lor >= r || loc < 0 || loc >= c){
                out ++;
            }
            else{
                if(map[lor][loc] == 1){
                    shot ++;
                    if(firsl == -1){
                        firsl = i+1;
                    }
                    if(shot == allship){
                        attacker = true;
                        winl = i+1;
                    }
                    map[lor][loc] = 2;
                    continue;
                }
                if(map[lor][loc] == 2){
                    shot_rep ++;
                    continue;
                }
                if(map[lor][loc] == 0){
                    sfail ++;
                    map[lor][loc] = 3;
                    continue;
                }
                if(map[lor][loc] == 3){
                    sfail_rep ++;
                    continue;
                }
            }
        }
        System.out.println(shot);
        System.out.println(sfail);
        System.out.println(shot_rep);
        System.out.println(sfail_rep);
        System.out.println(out);
        if(attacker){
            System.out.println("attacker " + winl);
        }
        else{
            System.out.println("battleship " + firsl);
        }
        sc.close();
    }
}
