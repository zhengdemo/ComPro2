import java.util.Scanner;

public class oddvseven {
    public static void main(String[] args) {
        int oddsum = 0, evensum=0, oddc = 0, evenc = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<8; i++){
            int x = sc.nextInt();
            if(x%2==0){
                evenc++;
                evensum+=x;
            }
            else{
                oddc++;
                oddsum+=x;
            }
        }
        // System.out.println(oddc);
        // System.out.println(evenc);
        if(oddsum>evensum){
            System.out.println("odd");
        }
        else if(oddsum<evensum){
            System.out.println("even");
        }
        else if(oddsum==evensum){
            System.out.println("equal");
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
