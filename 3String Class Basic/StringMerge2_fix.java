import java.util.Scanner;

public class StringMerge2_fix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String prt = "";
        for(int i=0; i<Math.min(str1.length(), str2.length()); i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            boolean brac1 = (c1 == '{' || c1 == '}' || c1 == '(' || c1 == ')' );
            boolean brac2 = (c2 == '{' || c2 == '}' || c2 == '(' || c2 == ')' );
            // bracket
            if(brac1 || (brac1 && brac2)){
                prt = prt + c1;
                continue;
            }
            else if(brac2 && !brac1){
                prt = prt + c2;
                continue;
            }
            // Isdigit
            else if(Character.isDigit(c1) || (Character.isDigit(c1) && Character.isDigit(c2))){
                prt = prt + c1;
                continue;
            }
            else if(Character.isDigit(c2) && !Character.isDigit(c1)){
                prt = prt + c2;
                continue;
            }
            //Upper Kub
            else if(Character.isUpperCase(c1) || (Character.isUpperCase(c1) && Character.isUpperCase(c2))){
                prt = prt + c1;
                continue;
            }
            else if(Character.isUpperCase(c2) && !Character.isUpperCase(c1)){
                prt = prt + c2;
                continue;
            }
            //Lowerrrr
            else if(Character.isLowerCase(c1) || (Character.isLowerCase(c1) && Character.isLowerCase(c2))){
                prt = prt + c1;
                continue;
            }
            else if(Character.isLowerCase(c2) && !Character.isLowerCase(c1)){
                prt = prt + c2;
                continue;
            }

        }
        System.out.println(prt);
        sc.close();
    }
}
