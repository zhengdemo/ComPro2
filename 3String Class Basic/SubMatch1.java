import java.util.Scanner;

public class SubMatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String base = sc.nextLine();
        String c1 = base.substring(0,3);
        String c2 = base.substring(1,4);
        String c3 = base.substring(2);
        int i1 = str.indexOf(c1);
        int i2 = str.indexOf(c2);
        int i3 = str.indexOf(c3);
        if(i1 == -1){
            System.out.println("No");
        }
        else{
            System.out.println(i1+1);
        }
        if(i2 == -1){
            System.out.println("No");
        }
        else{
            System.out.println(i2+1);
        }
        if(i3 == -1){
            System.out.println("No");
        }
        else{
            System.out.println(i3+1);
        }
        sc.close();
    }
}
