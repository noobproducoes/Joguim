package model;

public class Equipment {
	//GENERAL INFO
	private int codItem;
	private String name;
	private String type;
	//PROFILE STATUS
	private int damage;
	private int defense;
	// RESISTÊNCIAS
	private float fireResist;
	private float poisonResist;
	private float lightningResist;
	private float iceResist;
	private float physicalResist;
	private float bleedResist;
	private float curseResist;
	
	public int getCodItem() {
		return codItem;
	}
	public void setCodItem(int codItem) {
		this.codItem = codItem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	
	public Equipment addItem (String name, String type, int damage) {
		Equipment equip = new Equipment();
		
		this.name = name;
		this.type = type;
		this.damage = damage;
			
		return equip;
	}

	public Equipment addItem (String name, String type, int defense, float fireResist, float poisonResist, float lightningResist, float iceResist, float physicalResist, float bleedResist, float curseResist) {
		Equipment equip = new Equipment();
		
		this.name = name;
		this.type = type;
		this.defense = defense;
		this.fireResist = fireResist;
		this.poisonResist = poisonResist;
		this.lightningResist = lightningResist;
		this.iceResist = iceResist;
		this.physicalResist = physicalResist;
		this.bleedResist = bleedResist;
		this.curseResist = curseResist;
		
		return equip;
	}
	
}
