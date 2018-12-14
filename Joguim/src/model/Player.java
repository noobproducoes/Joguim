package model;

import java.util.ArrayList;

public class Player {
	// GENERAL INFO
	private String name;
	private int level = 1;
	private double exp = 0;
	private String vocation;
	private double gold;
	// PROFILE STATUS
	private int health;
	private int maxHealth;
	private int mana;
	private int maxMana;
	private int damage;
	private int baseDefense;
	private int defense;
	private int evasion;
	private int criticalChance;
	private String[] status = new String[6];
	private String[] curses = new String[6];
	// ATRIBUTOS
	private int str;
	private int agility;
	private int intelligence;
	private int endurance;
	// SE FOR CLERIC
	private int faith;
	// RESISTÊNCIAS
	private int fireResist;
	private int poisonResist;
	private int lightningResist;
	private int iceResist;
	private int physicalResist;
	private int bleedResist;
	private int curseResist;
	private ArrayList<Integer> quests = new ArrayList<Integer>();
	// EQUIPAMENTOS
	private Item weapon;
	private Item shield;
	private Item armor;
	private Item helm;
	private Item legs;
	private Item boots;
	// INVENTÁRIO
	private ArrayList<Item> inventory = new ArrayList<Item>();

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

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public String getVocation() {
		return vocation;
	}

	public void setVocation(String vocation) {
		this.vocation = vocation;
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

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getEndurance() {
		return endurance;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}

	public int getDamage() {
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

	public String[] getCurses() {
		return curses;
	}

	public void setCurses(String[] curses) {
		this.curses = curses;
	}

	public int getFaith() {
		return faith;
	}

	public void setFaith(int faith) {
		this.faith = faith;
	}

	public int getFireResist() {
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

	public int getCurseResist() {
		return curseResist;
	}

	public void setCurseResist(int curseResist) {
		this.curseResist = curseResist;
	}

	public ArrayList<Integer> getQuests() {
		return quests;
	}

	public void setQuests(ArrayList<Integer> quests) {
		this.quests = quests;
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

	public double getGold() {
		return gold;
	}

	public void setGold(double gold) {
		this.gold = gold;
	}

	public int getBaseDefense() {
		return baseDefense;
	}

	public void setBaseDefense(int baseDefense) {
		this.baseDefense = baseDefense;
	}

	public Item getWeapon() {
		return weapon;
	}

	public void setWeapon(Item weapon) {
		this.weapon = weapon;
	}

	public Item getShield() {
		return shield;
	}

	public void setShield(Item shield) {
		this.shield = shield;
	}

	public Item getArmor() {
		return armor;
	}

	public void setArmor(Item armor) {
		this.armor = armor;
	}

	public Item getHelm() {
		return helm;
	}

	public void setHelm(Item helm) {
		this.helm = helm;
	}

	public Item getLegs() {
		return legs;
	}

	public void setLegs(Item legs) {
		this.legs = legs;
	}

	public Item getBoots() {
		return boots;
	}

	public void setBoots(Item boot) {
		this.boots = boot;
	}

	public ArrayList<Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}

	public void rest(Player player) {
		player.health = player.maxHealth;
		player.mana = player.maxMana;
		
		System.out.println("Você está descansado.");
	}

	public boolean run(Player player) {
		float runChance = (float) Math.random();

		if (runChance <= 0.4) {
			System.out.println("Você fugiu.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return true;
		} else {
			double defenseDebuff = player.getDefense() - (player.getDefense() * 0.5);
			player.setDefense((int) defenseDebuff);
			System.out.println("Você falhou em fugir e abriu sua guarda, perdendo 50% de sua defesa.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return false;
		}
	}

	public void attack(Player player, Enemy mob) {
		damagePlayer(player);
		float dodge = (float) Math.random();
		if (dodge == (mob.getEvasion() / 100)) {
			System.out.println("O inimigo esquivou de seu ataque!");
		} else {
			float crit = (float) Math.random();
			if (crit <= (player.getCriticalChance() / 100)) {
				mob.setHealth(mob.getHealth() - ((player.getDamage() * 2) - mob.getDefense()));
				System.out.println("Você acertou um dano critico!");
				System.out.println("Você causou " + ((player.getDamage() * 2) - mob.getDefense()) + " de dano.");
			} else {
				mob.setHealth(mob.getHealth() - (player.getDamage() - mob.getDefense()));
				System.out.println("Você causou " + (player.getDamage() - mob.getDefense()) + " de dano.");
			}
		}
	}

	public void damagePlayer(Player player) {
		double newDamage = player.getStr() + player.getAgility() + player.getWeapon().getDamage();
		if (player.getVocation().equals("Warrior")) {
			player.setDamage((int)newDamage / 3);
		} else if (player.getVocation().equals("Archer")) {
			player.setDamage(player.getStr() + player.getAgility() + player.getWeapon().getDamage() / 3);
		} else if (player.getVocation().equals("Mage")) {
			player.setDamage(player.getIntelligence() + player.getAgility() + player.getWeapon().getDamage() / 3);
		} else if (player.getVocation().equals("Cleric")) {
			player.setDamage(player.getAgility() + player.getFaith() + player.getWeapon().getDamage() / 3);
		}
	}

	public boolean playerDeath(Player player) {
		if (player.getHealth() <= 0) {
			System.out.println("Você morreu. " + (player.getExp() * 0.1) + " pontos de experiência foram perdidos.");
			if (player.getExp() >= (player.getExp() * 0.1)) {
				player.setExp(player.getExp() - (player.getExp() * 0.1));
			} else {
				player.setExp(0);
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return true;
		} else {
			return false;
		}
	}
}