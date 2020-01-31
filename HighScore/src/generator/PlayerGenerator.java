package generator;

import data.Club;
import data.Player;

import java.util.Random;

public class PlayerGenerator {

    private static String[] Name = { "James", "Thomas", "Noah",
            "Alvin", "Soren", "Louis", "Devon",
            "Kellen", "Robby", "Max", "Connor", "Franklin",
            "Luke", "Edward", "Zac", "Ryan", "Rodney", "Mike" };
    private static String[] Surname = { "Simpson", "Turner", "Molina", "Burton", "Fletcher",
            "Phillips", "Ross", "Brown", "Anderson", "Melton", "Sanford", "Bishop", "Patel", "Powers", "Hartman",
            "Beard", "Barnes", "Gibson", "Todd", "Fernandez", "Todd", "Bruce", "Bennett", "Grant", "Young"};
    private static Random rand = new Random();

    private Club club;
    private String poste;


    public PlayerGenerator() {

    }

    public PlayerGenerator(Club club) {
        this.club = club;
    }

    public PlayerGenerator(Club club, String poste) {
        this.club = club;
        this.poste = poste;
    }


    public Player generatePlayer() {
        Player newPlayer = new Player();
        newPlayer.setClubName(this.club.getName());
        newPlayer.setName(generateName());
        newPlayer.setIsStar(Math.round(this.generateRandom(1, 16))!=2);
        newPlayer.setPoste(this.poste);
        newPlayer.setHeight(generateHeight());

        return newPlayer;
    }

    private String generateName() {
        return Name[rand.nextInt(Name.length)] + " "+
                Surname[rand.nextInt(Surname.length)];

    }

    private float generateHeight(){
        switch (this.poste){
            case"pivot":
                return generateRandom(1.90f, 2.10f);

            case "ailier":
                return generateRandom(1.80f, 2.00f);

            case"meneur":
                return generateRandom(1.90f, 2.00f);

            default:
                return 2.00f;
        }

    }

    private float generateRandom(float min ,float max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }

}
