package generator;

import data.Club;

public class ClubGenerator {

    private static String[] clubNames = { "Celics", "Nuggets", "Lakers",
            "Spurs", "Thunder", "Jazz", "Rockets",
            "Pelicans", "Raptors", "Bucks", "Pacers", "Cavaliers",
            "Heat", "Hornets", "Bulls", "Nets", "Grizzlies", "Mavericks", "Warriors","Clippers",
            "Timberwolves","Pistons", "Magic", "Wizards","Hawks", "Knicks", "Suns", "Kings", "Blazers", "Thunder", "Bouncers", "Winners"
    };

    public ClubGenerator(){

    }

    public void generateClubs(){
        for (int i=0; i<32; i++){
            Club newClub = new Club();
            newClub.setName(clubNames[i]);

        }
    }

}
