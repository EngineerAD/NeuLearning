package com.google.testing;

public class Characters {
	private String name;
	private String weapon;
	private int hp;
	private int damage;
	public Characters() {
	}
	public Characters(String name,String weapon, int damage, int hp) {
		setDamage(damage);
		setWeapon(weapon);
		setName(name);
		setHp(hp);
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void takeDamage(int damage) {
		this.hp -= damage;
	}

	
}
