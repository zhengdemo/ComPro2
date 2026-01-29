import java.util.Scanner;

public class WordStats2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min[] = new int[26];
        int max[] = new int[26];
        for(int i=0; i<26; i++){
            min[i] = Integer.MAX_VALUE;
            max[i] = Integer.MIN_VALUE;
        }
        for(int i=0; i<n; i++){
            String str = sc.next();
            int l = str.length();
            int index = (int)str.charAt(0); index-=65;
            if(l<min[index]){
                min[index] = l;
            }
            if(l>max[index]){
                max[index] = l;
            }
        }
        for(int i=0; i<26; i++){
            if(min[i] != Integer.MAX_VALUE && max[i] != Integer.MIN_VALUE){
                System.out.print((char)(i+65));
                System.out.print(" "+ min[i]+" "+max[i]);
                System.out.println();
            }
        }
        sc.close();
    }
}
