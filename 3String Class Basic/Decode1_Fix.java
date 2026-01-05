import java.util.Scanner;

public class Decode1_Fix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String map = sc.nextLine();
        String mess = sc.nextLine();
        String tomap = "", f = "", real = "";
        boolean out = false;
        for(int i=0; i<mess.length()-1; i++){
            tomap = "";
            int ch1 = (int) mess.charAt(i);
            int ch2 = (int) mess.charAt(i+1);
            if(!Character.isDigit(ch1) || !Character.isDigit(ch2)){
                if(out){
                    real = real + "_";
                    out = false;
                }
                continue;
            }

            tomap = tomap + mess.charAt(i) + mess.charAt(i+1);
            int index = Integer.parseInt(tomap);
            real = real + map.charAt(index);
            out = true;
            i++;

        }
        System.out.println(real);
        sc.close();
    }
}
