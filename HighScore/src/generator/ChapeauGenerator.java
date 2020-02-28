package generator;

import data.Club;

import java.util.*;
import java.util.stream.Collectors;

public class ChapeauGenerator {

    public ChapeauGenerator(){

    }

    @SuppressWarnings("unchecked")
	public ArrayList<ArrayList<Club>> generateChapeau(ArrayList<Club> clubs){
        ArrayList<Club> listClub = new ArrayList<Club>();

        for(Club club : clubs){
            MoyenneGenrator generator = new MoyenneGenrator(club);
            club.setLevel(generator.calculMoyenne());
            listClub.add(club);
        }

        Collections.sort(listClub);

        ArrayList<ArrayList<Club>> chapeaux = new ArrayList<ArrayList<Club>>();
        ArrayList<Club> chapeau1 = new ArrayList<Club>();
        ArrayList<Club> chapeau2 = new ArrayList<Club>();
        ArrayList<Club> chapeau3 = new ArrayList<Club>();
        ArrayList<Club> chapeau4 = new ArrayList<Club>();

        for (int i=0; i<32; i++){
            if(i<8){
                chapeau1.add(listClub.get(i));
            }else if (i>=8 && i<16){
                chapeau2.add(listClub.get(i));
            }else if (i>=16 && i<24){
                chapeau3.add(listClub.get(i));
            }else{
                chapeau4.add(listClub.get(i));
            }
        }

        chapeaux.add(chapeau1);
        chapeaux.add(chapeau2);
        chapeaux.add(chapeau3);
        chapeaux.add(chapeau4);

        System.out.println("\n --- Chapeau 1 ----\n");

        for(int i = 0; i<chapeau1.size();i++) {
            System.out.println(chapeau1.get(i).getName()+ "  |  "+chapeau1.get(i).getLevel());
        }

        System.out.println("\n --- Chapeau 2 ----\n");

        for(int i = 0; i<chapeau2.size();i++) {
            System.out.println(chapeau2.get(i).getName()+ "  |  "+chapeau2.get(i).getLevel());
        }

        System.out.println("\n --- Chapeau 3 ----\n");

        for(int i = 0; i<chapeau3.size();i++) {
            System.out.println(chapeau3.get(i).getName()+ "  |  "+chapeau3.get(i).getLevel());
        }

        System.out.println("\n --- Chapeau 4 ----\n");

        for(int i = 0; i<chapeau4.size();i++) {
            System.out.println(chapeau4.get(i).getName()+ "  |  "+chapeau4.get(i).getLevel());
        }

        return chapeaux;
    }



}
