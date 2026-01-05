import java.util.Scanner;

public class GeneticCode_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int f = str.indexOf('<');
        int s = str.indexOf('>');
        System.out.print(f+" "+s);
        for(int i=s+1; i<str.length(); i++){
            if(str.charAt(i) == '<'){
                System.out.println();
                System.out.print(i);
            }
            if(str.charAt(i) == '>'){
                System.out.print(" "+i);
            }
        }
        sc.close();
    }
}
