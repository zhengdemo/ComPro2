import java.util.Scanner;

public class AgeReport {
    public static int reportAge(int n, int[] id, int[] age, int y1, int y2) {
        int count = 0;
        for(int i = 0; i<n; i++){
            if(age[i] >= y1 && age[i] <= y2){
                count ++;
                System.out.println(id[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []id = new int[n];
        int []age = new int[n];
        for(int i=0; i<n; i++){
            id[i] = sc.nextInt();
            age[i] = sc.nextInt();
        }
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        //reportAge(n,id,age,y1,y2);
        int P = reportAge(n,id,age,y1,y2);
        System.out.println("There are " +P + " persons in age range of "+y1+" to "+y2);
        sc.close();
    }
}
