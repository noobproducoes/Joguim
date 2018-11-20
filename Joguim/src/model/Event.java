package model;

import java.util.Scanner;

import controller.Util;

public class Event {
	public Enemy spawnMob(int level) {
		Enemy mob = new Enemy();
		
		mob.setName("Zombie");
		mob.setLevel(level);
		mob.damageEnemy(mob, null);
		mob.setDefense(5);
		mob.setHealth(100);
		mob.setMana(0);
		mob.setEvasion(0);
		mob.setCriticalChance(10);		
		
		return mob;
	}
	
	public void battle(Player player, Enemy mob) {
		Scanner scan = new Scanner(System.in);
		Util util = new Util();
		int optCombate = -1;
		int turno = 1;
		
		while (player.getHealth() > 0 || mob.getHealth() > 0) {
			System.out.println("*************TURNO " + turno + "*************");
			util.showEnemyStats(mob);
			util.showStats(player);
			
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Atacar." + "        2 - Defender(+40%).");
			System.out.println("3 - Magia." + "        4 - Tentar fugir.");
			try {
				optCombate = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Digite apenas o número.");
			}
				
			if (optCombate == 1) {
				player.attack(player, mob);
				mob.attack(mob, player);
				turno++;
			} else if (optCombate == 2) {
				player.setDefense(player.getDefense() * 0.4f);
				mob.attack(mob, player);
				turno++;
			} else if (optCombate == 3) {
				//ABRE LISTA DE MAGIAS
			} else if (optCombate == 4) {
				if (player.run(player)) {
					break;
				} else {
					mob.attack(mob, player);
					turno++;
				}
			} else {
				System.out.println("Opção inválida.");
			}
		}
		scan.close();
	}
	
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