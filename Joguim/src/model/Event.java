package model;

public class Event {
	public void battleResult (Enemy enemy, Player player) {
        double calculo;
        enemy.getLevel();
        calculo = enemy.getLevel() * 2.5;
        player.setExp(player.getExp() + calculo);

        levelUp(player);
	}
	
	public void levelUp(Player player) {
		if (player.getExp() == 100) {
			player.setLevel(2);
		} else if (player.getExp() == 200) {
			player.setLevel(3);
		} else if (player.getExp() == 400) {
			player.setLevel(4);
		} else if (player.getExp() == 800) {
			player.setLevel(5);
		} else if (player.getExp() == 1500) {
			player.setLevel(6);
		} else if (player.getExp() == 2600) {
			player.setLevel(7);
		} else if (player.getExp() == 4200) {
			player.setLevel(8);
		} else if (player.getExp() == 6400) {
			player.setLevel(9);
		} else if (player.getExp() == 9300) {
			player.setLevel(10);
		}
	}
}
