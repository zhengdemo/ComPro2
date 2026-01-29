import java.util.Scanner;

public class CharsCompete2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int tsize = sc.nextInt();
        char t1[] = new char[tsize];
        char t2[] = new char[tsize];
        int ts1 = 0, ts2 = 0;
        for(int i=0; i<tsize; i++){
            t1[i] = sc.next().charAt(0);
        }
        for(int i=0; i<tsize; i++){
            t2[i] = sc.next().charAt(0);
        }

        int s = sc.nextInt();

        for(int i=0; i<str.length(); i++){
            char p = str.charAt(i);
            for(int j=0; j<tsize; j++){
                if(p == t1[j]){
                    ts1++;
                }
                if(p == t2[j]){
                    ts2++;
                }
            }
            if(ts1 == s || ts2 == s){
                break;
            }
        }

        if(ts1 > ts2){
            System.out.println("1");
            System.out.println(ts1+" "+ts2);
        }
        else if(ts2 > ts1){
            System.out.println("2");
            System.out.println(ts2+" "+ts1);
        }
        else if(ts1 == ts2){
            System.out.println("draw");
            System.out.println(ts1+" "+ts2);
        }

        sc.close();
    }
}
