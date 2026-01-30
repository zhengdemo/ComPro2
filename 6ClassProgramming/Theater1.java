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
        if(title == null || title.isEmpty()){
            System.out.println("invalid title");
        }
        else{
            this.title = title;
        }
    }
    public void setBasePrice(int basePrice){
        if(basePrice<=0){
            System.out.println("invalid price");
        }
        else{
            this.basePrice = basePrice;
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
        if(title.isEmpty()){
            System.out.println("title is not set");
        }
        else{
            System.out.println(title);
        }
        if(basePrice <= 0){
            System.out.println("price is not set");
        }
        else{
            System.out.println(basePrice);
        }
    }
}

// Do not modify the code below. You must leave it as is.
public class Theater1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int luxury1 = scan.nextInt();
        int numSeats = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if (threeD1 == 1)
            threeD = true;
        if (luxury1 == 1)
            luxury = true;
        Theater t = new Theater(threeD, luxury, numSeats);

        String dummy = scan.nextLine();// throw away a new line character
        String title = scan.nextLine();
        if (title.compareTo("-1") == 0)
            t.setTitle(null);
        else
            t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);
        t.printInfo();
    }
}