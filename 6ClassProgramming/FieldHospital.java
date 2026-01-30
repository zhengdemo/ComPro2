import java.util.Scanner; 
class FieldManager { 
    int HosBed;
    int []bed;
    public FieldManager(int hosBed) {
        this.HosBed = hosBed;
        bed = new int[HosBed];
    }
    public int reserveBed(){
        int rsvbed = -1;
            for(int i = 0; i<HosBed; i++){
                if(bed[i] == 0){
                    bed[i] = 1;
                    rsvbed = i+1;
                    break;
                }
            }
        return rsvbed;
    }
    public boolean discharge(int pos){
        if(bed[pos] != 1){
            System.out.println("Invalid bed number");
            return false;
        }
        else{
            System.out.println("Patient discharged");
            bed[pos] = 0;
            return true;
        }
    }
    public void reportBed(){
        int sum = 0;
        for(int i : bed){
            sum += i;
        }
        System.out.println(sum);
    }
} 
public class FieldHospital { 
  public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in); 
    final int N = scan.nextInt(); 
    FieldManager fm = new FieldManager(N);
         
    final int Q = scan.nextInt(); 
    for(int i = 0; i < Q; ++i) { 
        int K = scan.nextInt(); 
        int A = scan.nextInt();       
        if(K==1){
            int ptbed = fm.reserveBed();
            //System.out.println(ptbed);
            if(ptbed != -1){
                System.out.println("Bed " + ptbed + " reserved");
            }
            else{
                System.out.println("No bed vacancy");
            }
        }
        if(K==2){
            fm.discharge(A-1);
        }
        if(K==3){
            fm.reportBed();
        }
    }
    scan.close(); 
  }
}  