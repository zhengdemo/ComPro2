import java.util.Scanner;

public class UpSequence1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0; i<str.length()-1; i++){
            if( (int)str.charAt(i) >= (int)str.charAt(i+1)){
                System.out.println(str.charAt(i));
            }
        }
        System.out.println(str.charAt(str.length()-1));
        sc.close();
    }
}
