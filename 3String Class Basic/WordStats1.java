import java.util.Scanner;

public class WordStats1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            int index = (int)str[i].charAt(0);
            index-=65;
            arr[index]+=1;
        }
        for (int i = 0; i < 26; i++) {
            if(arr[i]!=0){
                System.out.println(((char)(i+65))+" "+arr[i]);
            }
        }
        sc.close();
    }
}
