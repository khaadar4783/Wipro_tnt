import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestVehicle {
    public static void main(String[] args) {
        System.out.println("=== Testing Hero Class ===");
        Hero heroBike = new Hero("Hero Splendor", "MH-12-AB-1234", "Alex Mercer", 80);
        System.out.println("Model: " + heroBike.getModelName());
        System.out.println("Reg No: " + heroBike.getRegistrationNumber());
        System.out.println("Owner: " + heroBike.getOwnerName());
        System.out.println("Current Speed: " + heroBike.getSpeed() + " km/h");
        heroBike.radio();

        System.out.println("\n=== Testing Honda Class ===");
        Honda hondaBike = new Honda("Honda Activa", "DL-3C-XY-5678", "Sarah Connor", 70);
        System.out.println("Model: " + hondaBike.getModelName());
        System.out.println("Reg No: " + hondaBike.getRegistrationNumber());
        System.out.println("Owner: " + hondaBike.getOwnerName());
        System.out.println("Current Speed: " + hondaBike.getSpeed() + " km/h");
        hondaBike.cdplayer();
    }
}