package br.com.isaias_atv_2019_02_20;

import java.util.ArrayList;
import java.util.Random;

public class Teste2 {

	public static void main(String[] args) {
		ArrayList<DuploPersonagem> Personagens = new ArrayList<DuploPersonagem>();
        Random Chance = new Random ();
        
        int j,k;
        Character [] personagem = new Character[4];
        personagem[0] = new King();
        personagem[1] = new Queen();
        personagem[2] = new Troll();
        personagem[3] = new Knight();
        
        for(int i = 0; i < 10; i++) {
            	DuploPersonagem DP = new DuploPersonagem();
        		j = Chance.nextInt(4);
        		DP.setPersonagemUm(personagem[j]);
        		k = Chance.nextInt(4);
        		while(k == j) k = Chance.nextInt(4);
        		DP.setPersonagemDois(personagem[k]);
        		Personagens.add(DP);
        		System.out.println(Personagens.get(i).getPersonagemUm().getClass().getSimpleName() + " - " + Personagens.get(i).getPersonagemDois().getClass().getSimpleName());
        }
        System.out.printf("\n\n\n------------------------------Começa a batalha!------------------------------\n\n\n");
		while(!Personagens.isEmpty()) {
			for(int i = 0;i <Personagens.size();i++) {
				j = Chance.nextInt(2);
				if(!Personagens.get(i).getChar(j).getHit()) {
					System.out.println(" no duelo entre " +Personagens.get(i).getPersonagemUm().getClass().getSimpleName() +" e "
																+ Personagens.get(i).getPersonagemDois().getClass().getSimpleName());
					Personagens.remove(i);
				}
			}
		}
	}

}
