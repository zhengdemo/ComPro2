import java.util.Scanner;

public class IndexOf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String find = sc.nextLine();
        int index = str.indexOf(find);
        if(index>-1){
            index+=1;
            System.out.println(index);
        }
        else{
            System.out.println("string not found");
        }
        sc.close();
    }
}
