import java.util.Scanner;

public class WordInBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int end = str.indexOf('}');
        int from = str.lastIndexOf('{', end);
        boolean print = false;
        if(end==-1 && from ==-1){
            System.out.println("not found");
        }
        else{
            String ans = "";
            if(from!=-1){
                ans = str.substring(from + 1 , end);
            }
            //System.out.println(from + " " + end);
            if(!ans.isEmpty() && !ans.contains("}")){
                System.out.println(ans);
                print = true;
            }
            while(end!=-1){
                end = str.indexOf('}', end+1);
                from = str.lastIndexOf('{', end);
                if(from!=-1){
                    ans = str.substring(from + 1 , end);
                    if(!ans.isEmpty() && !ans.contains("}")){
                        System.out.println(ans);
                        print = true;
                    }
                }
            }
            if(!print){
                System.out.println("not found");
            }
        }
    }
}
