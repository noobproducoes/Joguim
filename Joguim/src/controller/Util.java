package controller;

import java.util.Scanner;

import model.Enemy;
import model.Item;
import model.Player;

public class Util {
	public void showStats(Player player) {
		System.out.println("************************STATUS******************************");
		System.out.println("Health: " + player.getHealth() + "     Max Health: " + player.getMaxHealth());
		System.out.println("Mana: " + player.getMana() + "     Max Mana: " + player.getMaxMana());
		System.out.println("Damage: " + player.getDamage());
		System.out.println("Defense: " + player.getDefense());
		System.out.println("************************************************************");
	}
	
	public void showEnemyStats(Enemy mob) {
		System.out.println("************************STATUS DO INIMIGO******************************");
		System.out.println("Health: " + mob.getHealth() + "     Max Health: " + mob.getMaxHealth());
		System.out.println("Mana: " + mob.getMana() + "     Max Mana: " + mob.getMaxMana());
		System.out.println("Damage: " + mob.getDamage());
		System.out.println("Defense: " + mob.getDefense());
		System.out.println("***********************************************************************");
	}
	
	public int tavernMenu(Player player, Scanner scan) {
		int choice = -1;
		
		System.out.println("O que deseja fazer hoje, Sr. " + player.getName() + "?");
		System.out.println("1 - Sair pra explorar.                 " + "2 - Descansar por 10g(Recupera HP/MANA).");
		System.out.println("3 - Salvar progresso.                  " + "4 - Checar cartazes.");
		System.out.println("5 - Loja.                              " + "6 - Sair do jogo.");
		System.out.print("Faça sua escolha: ");
		try {
			choice = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Digite apenas o número. Erro na taverna.");
		}
		return choice;
	}
	
	public void usePotion(Player player) {
		for (Item potions : player.getInventory()) {
			if (potions.getItemId() == 5 && potions.getHeal() > 0) {
				player.setHealth(player.getHealth() + potions.getHeal());
				System.out.println("Você recuperou " + potions.getHeal() + " de vida.");
				potions.setQtd(potions.getQtd() - 1);
			} if (potions.getItemId() == 5 && potions.getRestoreMana() > 0) {
				player.setMana(player.getMana() + potions.getRestoreMana());
				System.out.println("Você recuperou " + potions.getRestoreMana() + " de mana.");
				potions.setQtd(potions.getQtd() - 1);
			}
			break;
		}
	}
	
	public int lojaMenu(Scanner scan) {
		int choice = -1;
		
		System.out.println("************************LOJA******************************");
		System.out.println("1 - Poção de Vida(50g).");
		System.out.println("2 - Poção de Mana(35g).");
		System.out.println("3 - Sair.");
		System.out.print("Vai comprar o que? ");
		
		try {
			choice = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Digite apenas o número. Erro na loja.");
		}
		
		return choice;
	}
}