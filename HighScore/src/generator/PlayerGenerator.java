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


    public PlayerGenerator() {

    }

    public PlayerGenerator(Club club) {
        this.club = club;
    }


    public Player generatePlayer() {
        Player newPlayer = new Player();
        newPlayer.setClubName(this.club.getName());
        newPlayer.setName(generateName());
        return newPlayer;
    }

    private String generateName() {
        return Name[rand.nextInt(Name.length)] + " "+
                Surname[rand.nextInt(Surname.length)];

    }

}
