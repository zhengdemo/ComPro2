import java.util.Scanner;

public class AtoZ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = -1, z = -1, dist = 0, min = str.length();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'A'){
                a = i;
                if(z!=-1){
                    dist = a - z  + 1;
                    if(dist < min){
                        min = dist;
                    }
                }
            }
            if(str.charAt(i) == 'Z'){
                z = i;
                if(a!=-1){
                    dist = z - a + 1;
                    if(dist < min){
                        min = dist;
                    }
                }
            }
        }
        System.out.println(min);
        sc.close();
    }
}
