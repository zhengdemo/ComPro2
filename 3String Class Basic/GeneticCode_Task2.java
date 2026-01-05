import java.util.Scanner;

public class GeneticCode_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int f = str.indexOf('<');
        int s = str.indexOf('>');
        System.out.println(str.substring(f+1,s));
        for(int i=s+1; i<str.length(); i++){
            if(str.charAt(i) == '<'){
                f = i;
            }
            if(str.charAt(i) == '>'){
                s = i;
                System.out.println(str.substring(f+1,s));
            }
        }
        sc.close();
    }
}
