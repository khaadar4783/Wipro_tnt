import com.automobile.Fourwheeler.Logan;
import com.automobile.Fourwheeler.Ford;

public class TestFourWheeler {
    public static void main(String[] args) {
        System.out.println("=== Testing Logan (FourWheeler) ===");
        Logan logan = new Logan("Logan LXI", "MH-12-AB-1234", "John Doe", 80);
        System.out.println("Model: " + logan.getModelName());
        System.out.println("Reg No: " + logan.getRegistrationNumber());
        System.out.println("Owner: " + logan.getOwnerName());
        System.out.println("Current Speed: " + logan.speed() + " km/h");
        logan.gps();

        System.out.println("\n=== Testing Ford (FourWheeler) ===");
        Ford ford = new Ford("Ford Endeavour", "DL-3C-XY-5678", "Jane Smith", 100);
        System.out.println("Model: " + ford.getModelName());
        System.out.println("Reg No: " + ford.getRegistrationNumber());
        System.out.println("Owner: " + ford.getOwnerName());
        System.out.println("Current Speed: " + ford.speed() + " km/h");
        ford.tempControl();
    }
}