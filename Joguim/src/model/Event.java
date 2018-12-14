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
		mob.setMaxHealth(100);
		mob.setMana(0);
		mob.setEvasion(0);
		mob.setCriticalChance(10);	
		
		return mob;
	}
	
	public void battle(Player player, Enemy mob, Scanner scan) {
		Util util = new Util();
		int turno = 1;
		int optCombate = -1;
		
		while (player.getHealth() > 0 || mob.getHealth() > 0) {			
			System.out.println("************************TURNO " + turno + "************************");
			util.showEnemyStats(mob);
			System.out.println("");
			util.showStats(player);
			System.out.println("");
			
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Atacar." + "        2 - Defender(+40%).");
			System.out.println("3 - Magia." + "        4 - Tentar fugir.");
			System.out.print("Escolha: ");
			
			try {
				optCombate = scan.nextInt();
				System.out.println("Aguarde...");
			} catch (Exception e) {
				System.out.println("Digite apenas o número.");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException ex) {
					e.printStackTrace();
				}
			}
				
			if (optCombate == 1) {
				player.attack(player, mob);
				mob.attack(mob, player);
				System.out.println("");

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if (player.playerDeath(player) || mob.enemyDeath(mob, player)) {
					break;
				}
				turno++;
			} else if (optCombate == 2) {
				double newDef = player.getDefense() + (player.getDefense() * 0.4);
				player.setDefense((int)newDef);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				mob.attack(mob, player);
				if (player.playerDeath(player) || mob.enemyDeath(mob, player)) {
					break;
				}
				turno++;
			} else if (optCombate == 3) {
				//ABRE LISTA DE MAGIAS
				if (player.playerDeath(player) || mob.enemyDeath(mob, player)) {
					break;
				}
			} else if (optCombate == 4) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (player.run(player)) {
					break;
				} else {
					mob.attack(mob, player);
					if (player.playerDeath(player) || mob.enemyDeath(mob, player)) {
						break;
					}
					turno++;
				}
			} else {
				System.out.println("Opção inválida.");
			}
		}
	}
	
	public void battleResult (Enemy enemy, Player player) {
		double calculo;
		enemy.getLevel();
		calculo = enemy.getLevel() * 2.5;
		player.setExp(player.getExp() + calculo);
		System.out.println("Você ganhou " + calculo + " pontos de experiência.");
			
		if (levelUp(player)) {
			System.out.println("Você atingiu o level " + player.getLevel() + "!");
		}
		System.out.println("Aguarde...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean levelUp(Player player) {
		if (player.getExp() == 100) {
			player.setLevel(2);
			return true;
		} else if (player.getExp() == 200) {
			player.setLevel(3);
			return true;
		} else if (player.getExp() == 400) {
			player.setLevel(4);
			return true;
		} else if (player.getExp() == 800) {
			player.setLevel(5);
			return true;
		} else if (player.getExp() == 1500) {
			player.setLevel(6);
			return true;
		} else if (player.getExp() == 2600) {
			player.setLevel(7);
			return true;
		} else if (player.getExp() == 4200) {
			player.setLevel(8);
			return true;
		} else if (player.getExp() == 6400) {
			player.setLevel(9);
			return true;
		} else if (player.getExp() == 9300) {
			player.setLevel(10);
			return true;
		} else {
			return false;
		}
	}
}