package model;

public class Enemy {
	// GENERAL INFO
	private String name;
	private int level;
	private int exp;
	// PROFILE STATUS
	private int health;
	private int mana;
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
	
	public void damageEnemy (Enemy enemy, Equipment equipment ) {
        if(enemy.getName().equals("Zumbie")) {
            enemy.setDamage(1900 * enemy.getLevel()/100);
        }else if(enemy.getName().equals("Ice Wolf")) {
            enemy.setDamage(1800 * enemy.getLevel()/100);
        }else if(enemy.getName().equals("Blood Golem")) {
            enemy.setDamage(1600 * enemy.getLevel()/100);
        }else if(enemy.getName().equals("Spider")) {
            enemy.setDamage(1800 * enemy.getLevel()/100);
        }
    }
}
