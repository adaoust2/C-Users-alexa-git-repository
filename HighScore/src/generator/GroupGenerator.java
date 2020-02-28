package generator;

import data.Club;

import java.util.ArrayList;
import java.util.Iterator;

public class GroupGenerator {

    private ArrayList<ArrayList<Club>> hats;

    private static String[] groupeName = {"groupeA","groupeB","groupeC","groupeD","groupeE","groupeF","groupeG","groupeH"};

    public GroupGenerator(ArrayList<ArrayList<Club>> hats){
        this.hats = hats;
    }

    public ArrayList<ArrayList<Club>> GenerateGroups(){

        ArrayList<ArrayList<Club>> groups = new ArrayList<ArrayList<Club>>();

        ArrayList<Club> groupA = new ArrayList<Club>();
        ArrayList<Club> groupB = new ArrayList<Club>();
        ArrayList<Club> groupC = new ArrayList<Club>();
        ArrayList<Club> groupD = new ArrayList<Club>();
        ArrayList<Club> groupE = new ArrayList<Club>();
        ArrayList<Club> groupF = new ArrayList<Club>();
        ArrayList<Club> groupG = new ArrayList<Club>();
        ArrayList<Club> groupH = new ArrayList<Club>();

        groups.add(groupA);
        groups.add(groupB);
        groups.add(groupC);
        groups.add(groupD);
        groups.add(groupE);
        groups.add(groupF);
        groups.add(groupG);
        groups.add(groupH);

        int currentPosition=0;
        for(ArrayList<Club> group : groups){
            System.out.println(" ------   "+groupeName[currentPosition]+" -----");
            for(ArrayList<Club> hat : hats){
                group.add(hat.get(currentPosition));
                hat.get(currentPosition).setGroup(groupeName[currentPosition]);
                System.out.println(hat.get(currentPosition).getName());
            }
            currentPosition++;
        }
        return groups;
    }

}
