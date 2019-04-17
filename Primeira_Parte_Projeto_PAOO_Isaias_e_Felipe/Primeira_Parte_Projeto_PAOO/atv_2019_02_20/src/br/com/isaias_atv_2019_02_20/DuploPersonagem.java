package br.com.isaias_atv_2019_02_20;

import java.util.ArrayList;

public class DuploPersonagem {
	public ArrayList <Character> Chars = new ArrayList<Character>();
	public void addPersonagem(Character c) {
		Chars.add(c);
	}
	public void setPersonagemUm(Character personagemUm) {
		Chars.add(0, personagemUm);;
	}
	public void setPersonagemDois(Character personagemDois) {
		Chars.add(1,personagemDois);
	}
	public Character getPersonagemUm() {
		return Chars.get(0);
	}
	public Character getPersonagemDois() {
		return Chars.get(1);
	}
	public Character getChar(int i) {
		return Chars.get(i);
	}
	public void Morreu(int i) {
		Chars.remove(i);
	}
	public int getSize() {
		return Chars.size();
	}
	public boolean isEmpty() {
		return Chars.isEmpty();
	}
}
