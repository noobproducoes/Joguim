package view;

import java.util.Scanner;

import model.Player;

public class Game {
	private static int optMenu;
	private static int optDifficulty;
	private static boolean menuDone = false;
	private static boolean dificultyDone = false;
	private static boolean characterDone = false;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			if (!menuDone) {
				System.out.println("Bem-vindo ao Joguim!");
				System.out.println("Escolha uma das opções abaixo, digitando apenas o número correspondente:");
				System.out.println("1 - Novo Jogo.");
				System.out.println("2 - Carregar Jogo Salvo.");
				System.out.println("3 - Sair.");
				System.out.print("Faça sua escolha: ");
				try {
					optMenu = scan.nextInt();
				} catch (Exception e) {
					System.out.println("Opção inválida. Digite apenas o número.");
					menuDone = false;
				}
				menuDone = true;
			}
			
			if (optMenu == 1) {
				if (!dificultyDone) {
					System.out.println("BORA! HORA DO SHOW!!");
					System.out.println("Escolha a dificuldade:");
					System.out.println("1 - Fácil.");
					System.out.println("2 - Normal.");
					System.out.println("3 - Difícil.");
					System.out.println("4 - Cancelar.");
					try {
						optDifficulty = scan.nextInt();
					} catch (Exception e) {
						System.out.println("Dificuldade inválida. Digite apenas o número.");
						dificultyDone = false; 
					}
					dificultyDone = true;
				}
				
				if (optDifficulty == 1 && !characterDone) {
					//INSERIR MODIFICADORES DE DIFICULDADE
					Player player = new Player();
					//INSTANCIAR CLASSE DE EVENTOS
					
					System.out.print("Qual será o seu nome? ");
					String nome = "";
					if (nome.trim() != "" && nome != null) {
						player.setName(scan.next().trim());
					}
					System.out.println("Escolha sua vocação: "
							+ "1 - Warrior"
							+ "2 - Mage"
							+ "3 - Archer"
							+ "4 - Cleric"
							+ "5 - Cancelar.");
					System.out.print("Faça sua escolha: ");
					int voc = -1;
					
					try {
						voc = scan.nextInt();
					} catch (Exception e) {
						System.out.println("Vocação inválida. Digite apenas o número.");
						characterDone = false;
					}
					
					if (voc == 1) {
						player.setVocation("Warrior");
						player.setHealth(150);
						player.setMana(15);
						player.setStr(20);
						player.setAgility(10);
						player.setIntelligence(5);
						player.setEndurance(15);
						//TEMPORARIO
							player.setDamage(10);
							player.setDefense(20);
							player.setEvasion(5);
							player.setCriticalChance(10);
						//FIM TEMPORARIO
						player.setFireResist(0);
						player.setPoisonResist(0);
						player.setBleedResist(0);
						player.setIceResist(0);
						player.setLightningResist(0);
						player.setPhysicalResist(0);
						player.setCurseResist(0);
						
						characterDone = true;
						
						System.out.println("Você escolheu a vocação: Warrior.");
					} else if (voc == 2) {
						player.setVocation("Mage");
						player.setHealth(80);
						player.setMana(50);
						player.setStr(5);
						player.setAgility(10);
						player.setIntelligence(20);
						player.setEndurance(10);
						//TEMPORARIO
							player.setDamage(13);
							player.setDefense(10);
							player.setEvasion(5);
							player.setCriticalChance(10);
						//FIM TEMPORARIO
						player.setFireResist(0);
						player.setPoisonResist(0);
						player.setBleedResist(0);
						player.setIceResist(0);
						player.setLightningResist(0);
						player.setPhysicalResist(0);
						player.setCurseResist(0);
						
						characterDone = true;
						
						System.out.println("Você escolheu a vocação: Mage.");
					} else if (voc == 3) {
						
					} else if (voc == 4) {
						
					} else if (voc == 5){
						characterDone = false;
					} else {
						System.out.println("Vocação inválida. Digite apenas o número.");
						characterDone = false;
					}
				} else if (optDifficulty == 2 && !characterDone) {
					//INSERIR MODIFICADORES DE DIFICULDADE
				} else if (optDifficulty == 3 && !characterDone) {
					//INSERIR MODIFICADORES DE DIFICULDADE
				} else if (optDifficulty == 4 && !characterDone) {
					dificultyDone = false;
				} else {
					System.out.println("Opção inválida. Digite apenas o número.");
				}				
			} else if (optMenu == 2) {
				
			} else if (optMenu == 3) {
				System.out.println("Até logo!");
				break;
			} else {
				System.out.println("Opção inválida. Digite apenas o número.");
			}
		}
		scan.close();
	}
}
