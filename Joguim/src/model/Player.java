package model;

import java.util.ArrayList;

public class Player {
	//GENERAL INFO
	private String name;
	private int level = 1;
	private double exp = 0;
	private String vocation;
	private double gold;
	//PROFILE STATUS
	private float health;
	private float maxHealth;
	private float mana;
	private float maxMana;
	private float damage;
	private float defense;
	private int evasion;
	private int criticalChance;
	private String[] status = new String[6];
	private String[] curses = new String[6];
	//ATRIBUTOS
	private int str;
	private int agility;
	private int intelligence;
	private int endurance;
	//SE FOR CLERIC
	private int faith;
	//RESISTÊNCIAS
	private float fireResist;
	private float poisonResist;
	private float lightningResist;
	private float iceResist;
	private float physicalResist;
	private float bleedResist;
	private float curseResist;
	private ArrayList<Integer> quests = new ArrayList<Integer>();
	//equipamentos
	
	
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
	public ArrayList<Integer> getQuests() {
		return quests;
	}
	public void setQuests(ArrayList<Integer> quests) {
		this.quests = quests;
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
	public double getGold() {
		return gold;
	}
	public void setGold(double gold) {
		this.gold = gold;
	}
	
	public void rest(Player player) {
		player.health = player.maxHealth;
		player.mana = player.maxMana;
		player.gold = player.gold - 10;
		
		System.out.println("Você está descansado.");
	}
}
