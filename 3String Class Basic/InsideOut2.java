import java.util.Scanner;

public class InsideOut2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = sc.nextInt();
        int c = 0, l = 0, r = 0;
        if(str.length()%2==0){
            //System.out.print(str.charAt(index));
            //System.out.print(str.charAt(index+1));
            for(int i=0; i<(str.length()/2); i++){
                l = index-i;
                if(l<0){
                    l+=str.length();
                }
                r = index+i+1;
                if(r>=str.length()){
                    r-=str.length();
                }
                System.out.print(str.charAt(l));
                System.out.print(str.charAt(r));
            }
        }
        else{
            System.out.print(str.charAt(index));
            for(int i=1; i<=(str.length()/2); i++){
                l = index-i;
                if(l<0){
                    l+=str.length();
                }
                r = index+i;
                if(r>=str.length()){
                    r-=str.length();
                }
                System.out.print(str.charAt(l));
                System.out.print(str.charAt(r));
            }
        }

        sc.close();
    }
}
