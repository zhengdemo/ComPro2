import java.util.Scanner;

public class SubMatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String base = sc.nextLine();
        int end = 3;
        for(int i=0; i<=base.length()-2; i++){
            if(end<=base.length()){
                String finder = base.substring(i, end);
                int index = str.indexOf(finder);
                //System.out.println("Checker "+finder+" "+i+" "+end);
                if(index!=-1){
                    System.out.println(index+1);
                }
                else{
                    System.out.println("No");
                }
                end++;
            }
        }
        sc.close();
    }
}
