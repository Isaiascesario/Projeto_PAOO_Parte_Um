package br.com.isaias_atv_2019_02_20;

public class Character {
	WeaponBehavior weapon;
	double vida;
	public void fight() {
		System.out.print(this.getClass().getSimpleName() + " ");
		this.weapon.useWeapon();
	}
	public void atacar(Character c) {
		c.getHit();
	}
	public boolean getHit() {
		if(vida > 0.1) {
			this.vida -= 0.1;
			return true;
		}
		else {
			System.out.print(this.getClass().getSimpleName()+" morreu");
			return false;
		}
	}
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	public WeaponBehavior getWeapon() {
		return weapon;
	}
	public Character(WeaponBehavior w) {
		this.weapon = w;
		this.vida = 1.0;
	}
}
