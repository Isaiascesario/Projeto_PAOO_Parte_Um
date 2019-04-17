package br.com.isaias_atv_2019_02_20;
import java.util.ArrayList;
import java.util.Random;

public class Teste {
	public static void main(String[] args) {
		ArrayList <Character> Personagens = new ArrayList<Character>();
        Random Chance = new Random ();
		King k = new King();
		Queen q = new Queen();
		Troll t = new Troll();
		Knight kn = new Knight();
		Personagens.add(k);
		Personagens.add(q);
		Personagens.add(t);
		Personagens.add(kn);
        WeaponBehavior [] arma = new WeaponBehavior[4];
        arma[0] = new AxeBehavior();
        arma[1] = new BowAndArrowBehavior();
        arma[2] = new KnifeBehavior();
        arma[3] = new SwordBehavior();
 
		System.out.println("=====================    Atacando   ===========================");
		for(Character e : Personagens) {
			e.fight();
		}
		System.out.println("=====================Mudando as Armas===========================");
		for(Character e : Personagens) {
			int i = Chance.nextInt(4);
			e.setWeapon(arma[i]);
		}
		System.out.println("=====================Atacando com as Armas Novas===========================");
		for(Character e : Personagens) {
			e.fight();
		}
		
	}

}
