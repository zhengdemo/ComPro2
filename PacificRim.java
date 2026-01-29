import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PacificRim {
    public static class Kaiju{
        String KaijuName;
        String Destro;
        int Khi;
        int Kwe;
        ArrayList<String> power;
        String Kinfo;
        
        public Kaiju() {
            KaijuName = "Unknown";
            Destro = "Unknown";
            Khi = 0;
            Kwe = 0;
            power = null;
            Kinfo = "Unknown";
        }

        public Kaiju(String kaijuName) {
            KaijuName = kaijuName;
            Destro = "Unknown";
            Khi = 0;
            Kwe = 0;
            power = null;
            Kinfo = "Unknown";
        }

        public Kaiju(String kaijuName, String destro, int khi, int kwe, String[] power, String kinfo) {
            KaijuName = kaijuName;
            Destro = destro;
            Khi = khi;
            Kwe = kwe;
            this.power = new ArrayList<>(Arrays.asList(power));
            Kinfo = kinfo;
        }
        public void PrintDetail(){
            System.out.println("Kaiju : " + KaijuName);
            System.out.println("< Category: Category " + Destro + " >");
            if(Khi <= 0 ){
                System.out.println("Height: Unknown");
            }
            else{
                System.out.println("Height: " + Khi + " feet (" + (Khi/3.2808) + " meters)");
            }
            if(Kwe <= 0){
                System.out.println("Weight: Unknown");
            }
            else{
                System.out.println("Weight: " + Kwe + " tons");
            }
            if(power == null){
                System.out.println("Power: Unknown");
            }
            else{
                System.out.println("Power: [" + power.size() + "] :");
                for(String i : power){
                    System.out.println(i);
                }
            }
            System.out.println("Description: " + Kinfo);
        }
           
    }
    public static class Jaeger{
        String JaName;
        String Country;
        int Version;
        double Height;
        ArrayList<String> Rider;
        ArrayList<String> Weapon;
        public Jaeger() {
            JaName = "Unknown";
            Country = "Unknown";
            Version = 0;
            Height = 0;
            Rider = null;
            Weapon = null;
        }
        public Jaeger(String jaName) {
            JaName = jaName;
            Country = "Unknown";
            Version = 0;
            Height = 0;
            Rider = null;
            Weapon = null;
        }
        public Jaeger(String jaName, String country, int version, double height, String[] rider,
                String[] weapon) {
            JaName = jaName;
            Country = country;
            Version = version;
            Height = height;
            Rider = new ArrayList<>(Arrays.asList(rider));
            Weapon = new ArrayList<>(Arrays.asList(weapon));
        }
        public void PrintDetail(){
            System.out.println("Jaegers : " + JaName);
            System.out.println("< Country of Origin: " + Country + " >");
            if(Version == 0){
                System.out.println("< Mark: Unknown >");
            }
            else{
                System.out.println("< Mark: Mark-" + Version + " >");
            }
            if(Height == 0){
                System.out.println("Height: Unknown ");
            }
            else{
                System.out.println("Height: " + Height + " meters");
            }
            if(Rider == null || Rider.isEmpty()){
                System.out.println("Pilots: Unknown ");
            }
            else{
                System.out.printf("Pilots: [%d] : \n", Rider.size());
                for(String i : Rider){
                    System.out.println(i);
                }
            }
            if(Weapon == null || Weapon.isEmpty()){
                System.out.println("Weapons: Unknown ");
            }
            else{
                System.out.printf("Weapons: [%d] : \n", Weapon.size());
                for(String i : Weapon){
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Jaeger j = null;
        Kaiju k = null;

        int typeK = sc.nextInt();
        if (typeK == 0) {
            k = new Kaiju();
        } else if (typeK == 1) {
            String name = sc.next();
            k = new Kaiju(name);
        } else if (typeK == 2) {
            String name = sc.next();
            String Category = sc.next();
            int Height = sc.nextInt();
            int Weight = sc.nextInt();
            String strp = sc.nextLine();
            strp = sc.nextLine();
            String Power[] = strp.split(",");
            String Description = sc.nextLine();
            k = new Kaiju(name, Category, Height, Weight, Power, Description);
        }

        int typeJ = sc.nextInt();
        
        if (typeJ == 0) {
            j = new Jaeger();
        } else if (typeJ == 1) {
            String t = sc.nextLine();
            String name = sc.nextLine();
            j = new Jaeger(name);
        } else if (typeJ == 2) {
            String temp = sc.nextLine();
            String name = sc.nextLine();
            String CoO = sc.nextLine();        
            int mark = sc.nextInt();
            double h = sc.nextDouble();
            temp = sc.nextLine();
            String str = sc.nextLine();
            String strp[] = str.split(",");
            String str2 = sc.nextLine();
            String strw[] = str2.split(",");
            j = new Jaeger(name, CoO, mark, h, strp, strw);
        }
        
        System.out.println("====================");
        j.PrintDetail();
        System.out.println("VS");
        k.PrintDetail();
        System.out.println("====================");

    }

}