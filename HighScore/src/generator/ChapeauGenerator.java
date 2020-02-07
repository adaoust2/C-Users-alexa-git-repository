package generator;

import data.Club;

import java.util.*;
import java.util.stream.Collectors;

public class ChapeauGenerator {

    public ChapeauGenerator(){

    }

    public void generateChapeau(ArrayList<Club> clubs){
        HashMap<Club, Float> listScore = new  HashMap<Club, Float>();

        for(Club club : clubs){
            MoyenneGenrator generator = new MoyenneGenrator(club);
            listScore.put(club, generator.calculMoyenne());
        }

        listScore = sortByValue(listScore);

        ArrayList<ArrayList<Club>> chapeaux = new ArrayList<ArrayList<Club>>();
        ArrayList<Club> chapeau1 = new ArrayList<Club>();
        ArrayList<Club> chapeau2 = new ArrayList<Club>();
        ArrayList<Club> chapeau3 = new ArrayList<Club>();
        ArrayList<Club> chapeau4 = new ArrayList<Club>();

        for (int i=0; i<32; i++){
            if(i<8){
            }else if (i>=8 && i<16){

            }else if (i>=16 && i<24){

            }else{

            }
        }

        System.out.println("\n Chapeau 1");

        for(int i = 0; i<chapeau1.size();i++) {
            System.out.println(chapeau1.get(i));
        }

        System.out.println("\n Chapeau 2");

        for(int i = 0; i<chapeau2.size();i++) {
            System.out.println(chapeau2.get(i));
        }
    }


    public static HashMap<Club, Float> sortByValue(final HashMap<Club, Float> wordCounts) {

        return wordCounts.entrySet()
                .stream()
                .sorted((HashMap.Entry.<Club, Float>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    }



}
