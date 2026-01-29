import java.util.Scanner;

public class StringInjection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mainStr = sc.next();
        int k = sc.nextInt();
        String output = "";
        for(int i=0; i<k; i++){
            String p = sc.next();
            String insert = sc.next();
            int m = sc.nextInt();
            if(m==0){
                if(Character.isDigit(p.charAt(0))){
                    int pos = Integer.parseInt(p);
                    output = mainStr.substring(0, pos) + insert + mainStr.substring(pos);
                }
                else{
                    int pos = mainStr.indexOf(p);
                    output = mainStr.substring(0, pos) + insert + mainStr.substring(pos);
                }
            }
            else if(m==1){
                if(Character.isDigit(p.charAt(0))){
                    int pos = Integer.parseInt(p);
                    if(pos < mainStr.length()-1){
                        output = mainStr.substring(0, pos) + insert + mainStr.substring(pos+insert.length());                        
                    }
                    else{
                        output = mainStr.substring(0, pos) + insert;                     
                    }
                }
                else{
                    int pos = mainStr.indexOf(p);
                    if(pos >= mainStr.length()-1){
                        output = mainStr.substring(0, pos) + insert;
                    }
                    else{
                        output = mainStr.substring(0, pos) + insert + mainStr.substring(pos+insert.length());
                    }
                }
            }
            System.out.println(output);
            mainStr = output;
        }
    }
}
