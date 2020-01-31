package manager;

import java.util.Random;

import data.Club;
import data.Match;
import generator.MoyenneGenrator;

public class MatchManager {
	
	int nbmatch;
	Club club1;
	Club club2;
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
	public void matchProcess(Club club1,Club club2) {
		float moy1,moy2;
		Match match1 = new Match (club1,club2,"");
		MoyenneGenrator moyequip1 = new MoyenneGenrator(club1);
		MoyenneGenrator moyequip2 = new MoyenneGenrator(club2);
		moy1=moyequip1.calculMoyenne();
		moy2=moyequip2.calculMoyenne();
		int res = victoire(moy1, moy2);
		if(res==1) {
			match1.setResultat(club2.getName());
			System.out.println("Le vaiqueur est " + match1.getResultat());
		}else {
			match1.setResultat(club1.getName());
			System.out.println("Le vainqueur est " + match1.getResultat());
		}
	}
	public int victoire(float moy1,float moy2) {
		float ran ;
		int res;
		if (moy1<moy2) {
			ran = moy2-moy1;
			res = (int) (Math.random()*(100-0));
			System.out.println("equip2>equip1 \n");
			if (ran<1) {
				if(res<55) {
					System.out.println("equipe 2 gagne " + res + " " + ran);
					return 1;
				}else					
				System.out.println("Equipe 1 gagne " + res + " " + ran);
				return 0;
			}else if (ran<3) {
				if(res<75) {
					System.out.println("equipe 2 gagne " + res + " " + ran);
					return 1;
				}else					
					System.out.println("equipe 1 gagne " + res + " " + ran);
				return 0;
			}else {
				System.out.println("equipe 2 gagne " + ran + " " + ran);
				return 1;
			}
			
		}else {
			ran = moy1-moy2;
			res = (int) (Math.random()*(100-0));
			
			System.out.println("equip1>equip2 \n");
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
