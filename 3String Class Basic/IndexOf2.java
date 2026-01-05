import java.util.Scanner;

public class IndexOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String find = sc.nextLine();
        int prev = 0, c = 0;
        for(int i=0; i<str.length(); i++){
            int index = str.indexOf(find,i);
            if(index+1!=prev&&index!=-1){
                System.out.print(index+1+" ");
                prev = index+1;
                c++;
            }
        }
        if(c==0){
            System.out.println("string not found");
        }
        sc.close();
    }
}
