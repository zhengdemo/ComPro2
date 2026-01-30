import java.util.ArrayList;
import java.util.Scanner;

public class KeyWord1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> kw = new ArrayList<String>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String text = sc.next();
            if(!kw.contains(text)){
                kw.add(text);
            }
        }
        for(int i=0; i<kw.size(); i++){
            System.out.print(kw.get(i) + " ");
        }
        sc.close();
    }
}
