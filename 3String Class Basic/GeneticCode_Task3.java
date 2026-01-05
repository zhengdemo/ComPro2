import java.util.Scanner;

public class GeneticCode_Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int f = 0;
        int s = 0;
        int start = 0;
        String fix = "";
        for(int i=0; i<str.length(); i++){
            String gname = "";
            if(str.charAt(i) == '<'){
                f = i;
            }
            if(str.charAt(i) == '>'){
                s = i;
                String gene = (str.substring(f+1,s));
                if(gene.equals("UAA")){
                    gname = "ochre";
                }
                else if(gene.equals("UAG")){
                    gname = "amber";
                }
                else if(gene.equals("UGA")){
                    gname = "opal";
                }
                else{
                    gname = "unknown";
                }
                fix = str.substring(start, f) + gname;
                start = s+1;
                System.out.print(fix);
            }
        }
        System.out.print(str.substring(start));
        sc.close();
    }
}
