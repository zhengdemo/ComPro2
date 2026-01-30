import java.util.Scanner; 
 
class Theater { 
    boolean[] seats;
    boolean lux, threeD;
    int nSeat;
    String title = "";
    int basePrice = -1;
    Theater(boolean threeD, boolean luxury, int numSeats){
        this.seats = new boolean[numSeats+1];
        this.threeD = threeD;
        this.lux = luxury;
        this.nSeat = numSeats;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setBasePrice(int basePrice){
        this.basePrice = basePrice;
    }
    public int reserveOne(int seatNumber){
        if(seatNumber <= 0 || 
            seatNumber > nSeat || 
            seats[seatNumber] == true)
        {
            System.out.println("sorry");
            return -1;
        }
        else{
            seats[seatNumber] = true;
            return basePrice;
        }
    }
    public int reserveMultiple(int numSeats, int seatNumber){
        if(seatNumber <= 0 || 
            seatNumber > nSeat || 
            seatNumber-1 + numSeats > nSeat)
        {
            System.out.println("sorry");
            return -1;
        }
        else{
            int sum = 0;
            for(int i = seatNumber; i<seatNumber+numSeats; i++){
                if(seats[i] == true){
                    System.out.println("sorry");
                    return -1;
                }
            }
            for(int i = seatNumber; i<seatNumber+numSeats; i++){
                seats[i] = true;
                sum += basePrice;
            }
            return sum;
        }
    }
    public void printInfo(){
        if(this.threeD){
            System.out.println("3D");
        }
        else{
            System.out.println("No 3D");
        }
        if(this.lux){
            System.out.println("Luxury");
        }
        else{
            System.out.println("Standard");
        }
        System.out.println(seats.length-1);
            System.out.println(title);
            System.out.println(basePrice);
    }
} 
 
// Do not modify the code below. You must leave it as is. 
public class Theater2 { 
  public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in); 
    int threeD1 = scan.nextInt(); 
    int luxury1 = scan.nextInt(); 
    int numSeats = scan.nextInt(); 
    boolean threeD = false; 
    boolean luxury = false; 
    if(threeD1 == 1) 
      threeD = true; 
    if(luxury1 == 1) 
      luxury = true; 
    Theater t = new Theater(threeD, luxury, numSeats); 
         
    String dummy = scan.nextLine(); // throw away new line character 
    String title = scan.nextLine(); 
    t.setTitle(title); 
         
    int basePrice = scan.nextInt(); 
    t.setBasePrice(basePrice); 
         
    int N = scan.nextInt(); 
    for(int i = 0; i < N; ++i) { 
      int numberOfSeats = scan.nextInt(); 
      int seatNumber = scan.nextInt(); 
      int totalPrice; 
      if(numberOfSeats == 1) 
        totalPrice = t.reserveOne(seatNumber); 
      else 
        totalPrice = t.reserveMultiple(numberOfSeats, seatNumber); 
      if(totalPrice > 0) 
        System.out.println(totalPrice); 
    } 
         
    t.printInfo(); 
  } 
}