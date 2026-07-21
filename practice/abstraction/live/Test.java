package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        // a. Create an instance of Veena and call play()
        System.out.println("--- Part A ---");
        Veena veenaObj = new Veena();
        veenaObj.play();

        // b. Create an instance of Saxophone and call play()
        System.out.println("\n--- Part B ---");
        Saxophone saxObj = new Saxophone();
        saxObj.play();

        // c. Place instances in a Playable type variable and call play()
        System.out.println("\n--- Part C (Polymorphism) ---");
        Playable playableInstrument;

        playableInstrument = veenaObj; // Assign Veena to Playable reference
        playableInstrument.play();

        playableInstrument = saxObj;   // Assign Saxophone to Playable reference
        playableInstrument.play();
    }
}