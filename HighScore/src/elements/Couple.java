package elements;

import data.Club;

public class Couple implements Comparable{

    private int points;
    private Club club;

    public Couple(int points, Club club) {
        super();
        this.points = points;
        this.club = club;
    }

    @Override
    public int compareTo(Object o) {
        float comparePoints =club.getPoints();
        return Float.compare(this.points,comparePoints);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


    public Club getClub() {
        return club;
    }


    public void setClub(Club club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Couple [points=" + points + ", club=" + club + "]";
    }


}
