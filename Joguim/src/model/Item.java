package model;

public class Item {
	private long itemId;
	private String name;
	private String type;
	private float heal;
	private float restoreMana;
	
	
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
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
	public float getHeal() {
		return heal;
	}
	public void setHeal(float heal) {
		this.heal = heal;
	}
	public float getRestoreMana() {
		return restoreMana;
	}
	public void setRestoreMana(float restoreMana) {
		this.restoreMana = restoreMana;
	}
	
	public Item addItem(String name, String type, float heal) {
		Item item = new Item();
		
		this.name = name;
		this.type = type;
		this.heal = heal;	
		
		return item;
	}
}
