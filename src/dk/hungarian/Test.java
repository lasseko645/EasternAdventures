package dk.hungarian;

import dk.hungarian.genstande.weapon.Weapon;
import dk.hungarian.genstande.weapon.WeaponKlasse;
import dk.hungarian.skabninger.monster.Monster;
import dk.hungarian.skabninger.monster.MonsterKlasse;

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
        Weapon sværd000100 = new Weapon("jernsværd", "et simpelt swærd lavet af jern", 2, 5, 10, WeaponKlasse.Normal );

        // jeg laver også lige et par monstre
        Monster drage000001 = new Monster("adult drake", "et drage lignende øjle med rød skæl", 4, Gender.UKØNNET, 14, 7, 47, MonsterKlasse.normal);
        Monster goblin000001 = new Monster("small goblin", "en lille forholdsvis harmløs goblin, med en kølle i hånden. ", 1, Gender.MAND, 4, 1, 5,MonsterKlasse.Small);

        //jeg kan nu gøre brug af mine metoder
        hammer000001.getBeskrivelse();


        drage000001.getNavn();


    }

}
