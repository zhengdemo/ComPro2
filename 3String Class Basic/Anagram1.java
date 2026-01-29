import java.util.Scanner;

public class Anagram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int arr[] = new int[8];
        for(int i=0; i<str.length(); i++){
            int index = (int) str.charAt(i);
            index -= 65;
            arr[index] += 1;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
