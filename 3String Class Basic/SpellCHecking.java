import java.util.Scanner;

public class SpellCHecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String dict[] = new String[n];
        boolean found = false;
        for(int i=0; i<n; i++){
            dict[i] = sc.next();
        }
        for(int i=0;i<10;i++){
            String text = sc.next();
            found = false;
            for(int j=0; j<n; j++){
                if(text.equals(dict[j])){
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.print("1");
                continue;
            }
            else{
                System.out.print("0");
                continue;
            }
        }
    }
}
