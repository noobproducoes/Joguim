package model;

public class Enemy {
	// GENERAL INFO
	private String name;
	private int level;
	private int exp;
	// PROFILE STATUS
	private float health;
	private float maxHealth;
	private float mana;
	private float maxMana;
	private float damage;
	private float defense;
	private int evasion;
	private int criticalChance;
	private String[] status = new String[6];
	// RESISTÊNCIAS
	private float fireResist;
	private float poisonResist;
	private float lightningResist;
	private float iceResist;
	private float physicalResist;
	private float bleedResist;
	private float curseResist;

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

	public float getHealth() {
		return health;
	}

	public void setHealth(float health) {
		this.health = health;
	}

	public float getMana() {
		return mana;
	}

	public void setMana(float mana) {
		this.mana = mana;
	}

	public float getDamage() {
		return damage;
	}

	public void setDamage(float damage) {
		this.damage = damage;
	}

	public float getDefense() {
		return defense;
	}

	public void setDefense(float defense) {
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

	public void setFireResist(float fireResist) {
		this.fireResist = fireResist;
	}

	public float getPoisonResist() {
		return poisonResist;
	}

	public void setPoisonResist(float poisonResist) {
		this.poisonResist = poisonResist;
	}

	public float getLightningResist() {
		return lightningResist;
	}

	public void setLightningResist(float lightningResist) {
		this.lightningResist = lightningResist;
	}

	public float getIceResist() {
		return iceResist;
	}

	public void setIceResist(float iceResist) {
		this.iceResist = iceResist;
	}

	public float getPhysicalResist() {
		return physicalResist;
	}

	public void setPhysicalResist(float physicalResist) {
		this.physicalResist = physicalResist;
	}

	public float getBleedResist() {
		return bleedResist;
	}

	public void setBleedResist(float bleedResist) {
		this.bleedResist = bleedResist;
	}

	public float getCurseResist() {
		return curseResist;
	}

	public void setCurseResist(float curseResist) {
		this.curseResist = curseResist;
	}
	
	public float getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(float maxHealth) {
		this.maxHealth = maxHealth;
	}

	public float getMaxMana() {
		return maxMana;
	}

	public void setMaxMana(float maxMana) {
		this.maxMana = maxMana;
	}
	
	public void attack(Enemy mob, Player player) {
		float dodge = (float) Math.random();
		if (dodge == (player.getEvasion() / 100)) {
			System.out.println("Você esquivou do ataque!");
		} else {
			float crit = (float) Math.random();
			if (crit <= (mob.getCriticalChance() / 100)) {
				player.setHealth(player.getHealth() - ((mob.getDamage() * 2) - player.getDefense()));
				System.out.print("Você tomou um dano critico!");
				System.out.println("Você tomou " + ((mob.getDamage() * 2) - player.getDefense()) + " de dano.");
			} else {
				if ((mob.getDamage() - player.getDefense()) < 0) {
					System.out.println("Você anulou o ataque!");
				} else {
	 				player.setHealth(player.getHealth() - (mob.getDamage() - player.getDefense()));
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