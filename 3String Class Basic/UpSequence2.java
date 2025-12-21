import java.util.Scanner;

public class UpSequence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int loca = 0;
        int now = 0;
        for(int i=0; i<str.length()-1; i++){
            if( (int)str.charAt(i) >= (int)str.charAt(i+1)){
                loca = i;
                for(int k=now; k<=loca; k++){
                    System.out.print(str.charAt(k));
                }
                now = loca+1;
                System.out.println();
            }
        }
        for(int k=now; k<str.length(); k++){
                System.out.print(str.charAt(k));
        }
        sc.close();
    }
}
