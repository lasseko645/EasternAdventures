package dk.hungarian;

import dk.hungarian.genstande.weapon.Weapon;
import dk.hungarian.genstande.weapon.WeaponKlasse;

public class Test {

    public static void test1() {
        // Her kommer testkoden
        Player grete = new Player("Grete");
        grete.displayPosition();
        // DEBUG  System.out.println("Grete er på X" + grete.getPosition()[0] + "Y" +grete.getPosition()[1]);

        Skabning s = new Skabning("as", "as", 1, Gender.APACHE_HELICOPTER);
        // Man kan ikke instanciere en abstract klasse
        // Genstand g = new Genstand();

        // for at se at der er en grund til at lave de værdier som jeg har lavet har jeg skabt to forskællige opjekter som gør brug af mine værdier
        Weapon hammer000001 = new Weapon("jernhammer", "en simpel hammer lavet af jern", 3, 0.0 , 14, WeaponKlasse.Heavy);
        Weapon sværd000100 = new Weapon("jernsværd", "et simpelt swærd", 2, 5, 10, WeaponKlasse.Normal );

        //jeg kan nu gøre brug af mine metoder


    }

}
