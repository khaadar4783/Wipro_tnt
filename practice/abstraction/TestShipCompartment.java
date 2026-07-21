import com.wipro.automobile.ship.Compartment;

public class TestShipCompartment {
    public static void main(String[] args) {
        // Create an instance of the Compartment class with sample dimensions: 
        // height = 15.5, width = 20.0, breadth = 35.5
        Compartment shipCompartment = new Compartment(15.5, 20.0, 35.5);

        // Display the details using the display method
        shipCompartment.displayDetails();

        // Alternatively, access the values using the getter methods
        System.out.println("\n--- Accessing individual dimensions via Getters ---");
        System.out.println("Compartment Height: " + shipCompartment.getHeight());
        System.out.println("Compartment Width: " + shipCompartment.getWidth());
        System.out.println("Compartment Breadth: " + shipCompartment.getBreadth());

        // Modify dimensions using setter methods
        System.out.println("\n--- Modifying dimensions using Setters ---");
        shipCompartment.setHeight(18.0);
        shipCompartment.setWidth(22.5);
        
        // Display updated details
        shipCompartment.displayDetails();
    }
}