import java.util.Scanner;

public class InsideOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int mid = str.length()/2, count = 0;
        int l = mid-1, r = 0;
        if(str.length()%2 == 0){
            mid-=1;
            System.out.print(str.charAt(mid));
            for(int i=1; i<=mid; i++){
                System.out.print(str.charAt(mid+i));
                System.out.print(str.charAt(mid-i));
            }
            System.out.print(str.charAt(str.length()-1));
        }
        else{
            System.out.print(str.charAt(mid));
            for(int i=1; i<=mid; i++){
            System.out.print(str.charAt(mid-i));
            System.out.print(str.charAt(mid+i));
            }
        }
        sc.close();
    }    
}
