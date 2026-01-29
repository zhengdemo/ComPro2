import java.util.Scanner;

public class Anagram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int frq1[] = new int[8];
        int frq2[] = new int[8];
        int cmp[] = new int[8];
        int ana = 0;
        for(int i=0; i<str1.length(); i++){
            int index = (int) str1.charAt(i);
            index-=65;
            frq1[index] += 1;
        }
        for(int i=0; i<str2.length(); i++){
            int index = (int) str2.charAt(i);
            index-=65;
            frq2[index] += 1;
        }
        for(int i=0; i<8; i++){
            cmp[i] = Math.max(frq1[i], frq2[i]) - Math.min(frq1[i], frq2[i]);
        }
        for(int i=0; i<8; i++){
            System.out.print(frq1[i] + " ");
        }
        System.out.println();
        for(int i=0; i<8; i++){
            System.out.print(frq2[i] + " ");
        }
        System.out.println();
        for(int i=0; i<8; i++){
            System.out.print(cmp[i] + " ");
            ana += cmp[i];
        }
        System.out.println();
        if(ana<=3){
            System.out.println("anagram");
        }
        else{
            System.out.println("no");
        }
        sc.close();
    }
}
