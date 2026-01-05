import java.util.Scanner;

public class CharCount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int arr[] = new int[26];
        for(int i=0; i<str.length(); i++){
            arr[((int)(str.charAt(i)))-65] += 1;
        }
        for(int i=0; i<26; i++){
            if(arr[i]!=0){
                System.out.println((char)(i+65)+" "+arr[i]);
            }
        }
    }
}
