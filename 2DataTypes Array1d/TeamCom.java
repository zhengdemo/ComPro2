import java.util.Scanner;

public class TeamCom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int t1[] = new int[n];
        int t2[] = new int[n];
        int t1s = 0, t2s = 0;
        for(int i=0; i<n; i++){
            t1[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            t2[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(t1[i]>t2[i]){
                t1s+=2;
            }
            if(t2[i]>t1[i]){
                t2s+=2;
            }
            if(t1[i]==t2[i]){
                t1s+=1;
            }
            if(t2[i]==t1[i]){
                t2s+=1;
            }
        }   
        if(t1s > t2s){
            System.out.println("Team 1 wins");
            System.out.printf("Score %d to %d", t1s, t2s);
        }    
        if(t2s > t1s){
            System.out.println("Team 2 wins");
            System.out.printf("Score %d to %d", t2s, t1s);
        }   
        if(t2s == t1s){
            System.out.println("Draw game");
            System.out.printf("Score %d to %d", t2s, t1s);
        }   
    }
}
