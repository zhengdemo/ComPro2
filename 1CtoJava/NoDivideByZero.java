import java.util.Scanner;

public class NoDivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        if(z != 0){
            double sum = x+y;
            System.out.printf("%.6f", sum/z);
        }
        else{
            System.out.println("cannot divide by zero");
        }
    }
}