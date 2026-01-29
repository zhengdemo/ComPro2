import java.util.Scanner;

public class Asta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String owner = sc.nextLine();
        String reader = sc.nextLine();
        String book = sc.nextLine();
        if(reader.equalsIgnoreCase("asta") || owner.equalsIgnoreCase("asta")){
            for(int i=0; i<book.length(); i++){
                System.out.print((char)((int)book.charAt(i)+1));
            }
        }
        else if(reader.equalsIgnoreCase(owner)){
            
            System.out.println(book);
        }
        else{
            for(int i=0; i<book.length(); i++){
                System.out.print((char)((int)book.charAt(i)-1));
            }
        }
        sc.close();
    }
}
