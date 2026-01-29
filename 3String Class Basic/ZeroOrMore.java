import java.util.Scanner;

public class ZeroOrMore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f = sc.next();
        String word = sc.next();
        int star = f.indexOf('*');
        int index = 0;
        if(star == 0){
            index = word.indexOf(f.substring(star+1));
            System.out.print(word.substring(0, index));
        }
        else if(star == f.length()-1){
            System.out.print(word.substring(star));
        }
        else{
            String Last = f.substring(star+1);
            index = word.indexOf(Last);
            System.out.print(word.substring(star, index));
        }
        sc.close();
    }
}
