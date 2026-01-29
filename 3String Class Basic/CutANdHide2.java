import java.util.Scanner;

public class CutANdHide2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (true) {
            int cm = sc.nextInt();
            if(cm==0){
                break;
            }
            String find = sc.next();
            if(cm==1){
                int index = str.indexOf(find);
                if(index!=-1){
                    str = str.substring(index);
                }
                System.out.println(str);
            }
            else if(cm==2){
                int index = str.lastIndexOf(find);
                if(index!=-1){
                    str = str.substring(0,index+find.length());
                }
                System.out.println(str);
            }
            else if(cm==3){
                int id1 = str.indexOf(find);
                int id2 = str.lastIndexOf(find);
                if(id1!=-1 && id2!=-1){
                    str = str.substring(id1,(id2 + find.length()));
                }
                System.out.println(str);
            }
        }
    }
}
