package Entities;

public class People {
	private String name;
	private int life;
	private int damage;

	public People(String name, int life, int damage) {
		this.name = name;
		this.life = life;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}
