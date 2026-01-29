import java.util.Scanner;

public class RemoveMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int k = sc.nextInt();
            String dw = sc.next();
            if(k == 1){
                int index = str.indexOf(dw);
                if(index!=-1){
                    str = str.substring(0,index) + str.substring(index + dw.length());
                    System.out.println(str);
                }
                else{
                    System.out.println(str);
                }
            }
            else{
                int index = str.lastIndexOf(dw);
                if(index!=-1){
                    str = str.substring(0,index) + str.substring(index + dw.length());
                    System.out.println(str);
                }
                else{
                    System.out.println(str);
                }
            }
        }
        sc.close();
    }    
}

