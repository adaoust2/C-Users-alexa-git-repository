package manager;

import java.util.Random;

import data.Club;
import data.Match;
import generator.MoyenneGenrator;

public class MatchManager {

	int nbmatch;
	Club club1;
	Club club2;

	public MatchManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MatchManager(int nbmatch,Club club1,Club club2){
		this.nbmatch=nbmatch;
		this.club1=club1;
		this.club2=club2;
	}
	/*
	 * entrée club1 et club 2
	 * recupération de la moyenne de chacune des équipes
	 * puis utilisation de la methode victioire pour calcul
	 * du résultat en fonction du resultat de celle ci
	 * donne le resultat du match
	 */
	public Club matchProcess(Club club1,Club club2) {

		System.out.println("\nMATCH : "+ club1.getName()+" VS "+club2.getName());

		float moy1,moy2;
		Match match1 = new Match(club1,club2,"");
		MoyenneGenrator moyequip1 = new MoyenneGenrator(club1);
		MoyenneGenrator moyequip2 = new MoyenneGenrator(club2);
		moy1=moyequip1.calculMoyenne();
		moy2=moyequip2.calculMoyenne();
		int res = victoire(moy1, moy2);
		if(res==1) {
			match1.setResultat(club2.getName());
			club2.incPoints();
			System.out.println("Le vaiqueur est " + match1.getResultat());
			System.out.println("Points: " + club2.getPoints());
			System.out.println("Groupe: " + club2.getGroup());
			return club2;
		}else {
			match1.setResultat(club1.getName());
			club1.incPoints();
			System.out.println("Le vainqueur est " + match1.getResultat());
			System.out.println("Points: " + club1.getPoints());
			System.out.println("Groupe: " + club1.getGroup());
			return club1;
		}
	}
	public int victoire(float moy1,float moy2) {
		float ran ;
		int res;
		if (moy1<moy2) {
			ran = moy2-moy1;
			res = (int) (Math.random()*(100-0));
			if (ran<1) {
				if(res<55) {
					return 1;
				}else

				return 0;
			}else if (ran<3) {
				if(res<75) {

					return 1;
				}else

				return 0;
			}else {
				System.out.println("equipe 2 gagne ");
				return 1;
			}

		}else {
			ran = moy1-moy2;
			res = (int) (Math.random()*(100-0));

			System.out.println("equip1>equip2");
			if (ran<1) {
				if(res<55) {
					System.out.println("equipe 1 gagne " + res + " " + ran);
					return 0;
				}else
					System.out.println("Equipe 2 gagne " + res + " " + ran);
				return 1;
			}else if (ran<3) {
				if(res<75) {
					System.out.println("equipe 1 gagne " + res + " " + ran);
					return 0;
				}else
					System.out.println("equipe 2 gagne " + res + " " + ran);
				return 1;
			}else {
				System.out.println("equipe 1 gagne " + " " + ran);
				return 0;
			}

		}

	}
}
