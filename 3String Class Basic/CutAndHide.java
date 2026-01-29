import java.util.Scanner;

public class CutAndHide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        int s = str.indexOf(c);
        int e = str.lastIndexOf(c);
        String cut = str.substring(s, e+1);
        //System.out.println(cut);
        for(int i = 0; i<cut.length(); i++){
            if(cut.charAt(i) != c){
                System.out.print(cut.charAt(i));
            }
            if(i == 0 || i == cut.length()-1){
                System.out.print(cut.charAt(i));
            }
        }
        sc.close();
    }
}
