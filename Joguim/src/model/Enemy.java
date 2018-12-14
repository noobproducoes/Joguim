package model;

public class Enemy {
	// GENERAL INFO
	private String name;
	private int level;
	private int exp;
	// PROFILE STATUS
	private int health;
	private int maxHealth;
	private int mana;
	private int maxMana;
	private int damage;
	private int defense;
	private int evasion;
	private int criticalChance;
	private String[] status = new String[6];
	// RESISTÊNCIAS
	private int fireResist;
	private int poisonResist;
	private int lightningResist;
	private int iceResist;
	private int physicalResist;
	private int bleedResist;
	private int curseResist;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public float getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getEvasion() {
		return evasion;
	}

	public void setEvasion(int evasion) {
		this.evasion = evasion;
	}

	public int getCriticalChance() {
		return criticalChance;
	}

	public void setCriticalChance(int criticalChance) {
		this.criticalChance = criticalChance;
	}

	public String[] getStatus() {
		return status;
	}

	public void setStatus(String[] status) {
		this.status = status;
	}

	public float getFireResist() {
		return fireResist;
	}

	public void setFireResist(int fireResist) {
		this.fireResist = fireResist;
	}

	public int getPoisonResist() {
		return poisonResist;
	}

	public void setPoisonResist(int poisonResist) {
		this.poisonResist = poisonResist;
	}

	public int getLightningResist() {
		return lightningResist;
	}

	public void setLightningResist(int lightningResist) {
		this.lightningResist = lightningResist;
	}

	public int getIceResist() {
		return iceResist;
	}

	public void setIceResist(int iceResist) {
		this.iceResist = iceResist;
	}

	public int getPhysicalResist() {
		return physicalResist;
	}

	public void setPhysicalResist(int physicalResist) {
		this.physicalResist = physicalResist;
	}

	public int getBleedResist() {
		return bleedResist;
	}

	public void setBleedResist(int bleedResist) {
		this.bleedResist = bleedResist;
	}

	public float getCurseResist() {
		return curseResist;
	}

	public void setCurseResist(int curseResist) {
		this.curseResist = curseResist;
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getMaxMana() {
		return maxMana;
	}

	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}
	
	public void attack(Enemy mob, Player player) {
		float dodge = (float) Math.random();
		if (dodge == (player.getEvasion() / 100)) {
			System.out.println("Você esquivou do ataque!");
		} else {
			float crit = (float) Math.random();
			if (crit <= (mob.getCriticalChance() / 100)) {
				float hp = player.getHealth() - ((mob.getDamage() * 2) - player.getDefense());
				player.setHealth((int)hp);
				System.out.print("Você tomou um dano critico!");
				System.out.println("Você tomou " + ((mob.getDamage() * 2) - player.getDefense()) + " de dano.");
			} else {
				if ((mob.getDamage() - player.getDefense()) < 0) {
					System.out.println("Você anulou o ataque!");
				} else {
					float hp = player.getHealth() - (mob.getDamage() - player.getDefense());
	 				player.setHealth((int)hp);
					System.out.println("Você tomou " + (mob.getDamage() - player.getDefense()) + " de dano.");
				}
			}
		}
	}
	
	public void damageEnemy (Enemy enemy, Equipment equipment ) {
		if(enemy.getName().equals("Zombie")) {
			enemy.setDamage(29*enemy.getLevel());
		}else if(enemy.getName().equals("Ice Wolf")) {
			enemy.setDamage(28*enemy.getLevel());
		}else if(enemy.getName().equals("Blood Golem")) {
			enemy.setDamage(26*enemy.getLevel());
		}else if(enemy.getName().equals("Spider")) {
			enemy.setDamage(28*enemy.getLevel());
		}
	}
	
	public boolean enemyDeath(Enemy mob, Player player) {
		Event ev = new Event();
		
		if (mob.getHealth() <= 0) {
			System.out.println("Inimigo abatido!");
			ev.battleResult(mob, player);
			return true;
		} else {
			return false;
		}
	}
}