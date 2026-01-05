import java.util.Scanner;

public class StringMerge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int k = sc.nextInt();
        String pr = "";

        for(int i=0; i<Math.min(str1.length(), str2.length()); i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if(Character.isUpperCase(c1)){
                if(Character.isUpperCase(c2)){
                    if(k == 1){
                        pr = pr + c1;
                    }
                    else{
                        pr = pr + c2;
                    }
                }
                else{
                    pr = pr + c1;
                }
            }
            else if(Character.isUpperCase(c2)){
                if(Character.isUpperCase(c1)){
                    if(k == 1){
                        pr = pr + c1;
                    }
                    else{
                        pr = pr + c2;
                    }
                }
                else{
                    pr = pr + c2;
                }
            }
            else{
                if(Character.isLowerCase(c1)){
                    if(Character.isLowerCase(c2)){
                        if(k == 1){
                            pr = pr + c1;
                        }
                        else{
                            pr = pr + c2;
                        }
                    }
                    else{
                        pr = pr + c1;
                    }
                }
                else if(Character.isLowerCase(c2)){
                    if(Character.isLowerCase(c1)){
                        if(k == 1){
                            pr = pr + c1;
                        }
                        else{
                            pr = pr + c2;
                        }
                    }
                    else{
                        pr = pr + c2;
                    }
                }
            }
        }
        System.out.println(pr);
        sc.close();
    }
}
