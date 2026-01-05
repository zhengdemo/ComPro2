import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String f = sc.next();
        char find = f.charAt(0);
        int end = 0, begin = 0, count = 0;
        String sub = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == find){
                end = i;
                sub = str.substring(begin,end);
                if(sub != ""){
                    System.out.println(sub);
                }
                begin = end+1;
                count++;
            }
        }
        sub = str.substring(begin);
        if(sub != "" && count!=0){
            System.out.println(sub);
        }
        if(count == str.length()){
            System.out.println("no output");
        }
        if(count == 0){
            System.out.println("no target character found");
        }
        sc.close();
    }
}
