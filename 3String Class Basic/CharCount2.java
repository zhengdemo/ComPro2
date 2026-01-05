import java.util.Scanner;

public class CharCount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int c = 0, index = 0;
        int arr[] = new int[26];
        boolean ktrue = false;
        while (!ktrue) {
            String str = sc.nextLine();
            c++;
            for(int i=0; i<str.length(); i++){
                arr[((int)(str.charAt(i)))-65] += 1;
                if(arr[((int)(str.charAt(i)))-65] == k){
                    index = ((int)(str.charAt(i))-65);
                    ktrue = true;
                    break;
                }
            }
        }
        System.out.println((char)((index)+65));
        System.out.println(c-1);
    }
}
