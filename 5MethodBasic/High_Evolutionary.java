import java.util.Scanner;

public class High_Evolutionary {
    public static int Evolution(int w, int x, int y, int z){
        int one, two ,three, four;
        one = (w + x) - y * z;
        two =  w + x - (y * z);
        three = w + (x - y) * z;
        four = ((w+x) - y) * z;
        int max = Math.max(one, Math.max(two, Math.max(three, four)));
        System.out.println(one + " " + two + " " + three + " " + four);
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(Evolution(a, b, c, d));
        sc.close();
    }
}
