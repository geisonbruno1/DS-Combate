package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion() {

	}

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
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

	public int getAttack() {
		return attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void takeDamage(Champion other) {
		int damage = other.attack - armor;
		if (armor > damage) {
			life = life - 1;
		} else {
			life = life - damage;
		}

	}

	public String status() {
		if (life > 0) {
			return name 
					+ ": "
					+ life 
					+ " de vida";
		} else {
			life = 0;
			return name
					+ ": "
					+ life
					+ " de vida (morreu)";
		}
	}
}
