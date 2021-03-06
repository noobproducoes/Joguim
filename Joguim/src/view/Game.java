
package view;

import java.util.Scanner;

import controller.Util;
import model.Enemy;
import model.Event;
import model.Item;
import model.Player;

public class Game {
	private static int optMenu;
	private static int optDifficulty;
	private static boolean menuDone = false;
	private static boolean dificultyDone = false;
	private static boolean characterDone = false;
	private static boolean exit = false;
	public static Scanner scanInt = new Scanner(System.in);
	public static Scanner scanStr = new Scanner(System.in);
	
	public static void main(String[] args) {		
		while (true) {
			if (!menuDone) {
				System.out.println("Bem-vindo ao Joguim!");
				System.out.println("Escolha uma das opções abaixo, digitando apenas o número correspondente:");
				System.out.println("1 - Novo Jogo.");
				System.out.println("2 - Carregar Jogo Salvo.");
				System.out.println("3 - Sair.");
				System.out.print("Faça sua escolha: ");
				try {
					optMenu = scanInt.nextInt();
					System.out.println("Aguarde...");
				} catch (Exception e) {
					System.out.println("Opção inválida. Digite apenas o número.");
					menuDone = false;
				}
				menuDone = true;
			}
			
			if (optMenu == 1) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (!dificultyDone) {
					System.out.println("BORA! HORA DO SHOW!!");
					System.out.println("1 - Fácil.");
					System.out.println("2 - Normal.");
					System.out.println("3 - Difícil.");
					System.out.println("4 - Cancelar.");
					try {
						System.out.print("Escolha a dificuldade: ");
						optDifficulty = scanInt.nextInt();
						System.out.println("Aguarde...");
					} catch (Exception e) {
						System.out.println("Dificuldade inválida. Digite apenas o número.");
						dificultyDone = false; 
					}
					dificultyDone = true;
				}
				
				if (optDifficulty == 1 && !characterDone) {
					//INSERIR MODIFICADORES DE DIFICULDADE
					Player player = new Player();
					Item equip = new Item();
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.print("Qual será o seu nome? ");
					String nome = scanStr.next().trim();
					if (nome.trim() != "" && nome != null) {
						player.setName(nome);
					}
					System.out.println("Escolha sua vocação: ");
					System.out.println(" 1 - Warrior"
								+ " 2 - Mage"
								+ " 3 - Archer"
								+ " 4 - Cleric"
								+ " 5 - Cancelar.");
					System.out.print("Faça sua escolha: ");
					int voc = -1;
					
					try {
						voc = scanInt.nextInt();
						System.out.println("Aguarde...");
					} catch (Exception e) {
						System.out.println("Vocação inválida. Digite apenas o número.");
						characterDone = false;
					}
					
					if (voc == 1) {
						player.setVocation("Warrior");
						player.setHealth(150);
						player.setMaxHealth(150);
						player.setMana(15);
						player.setMaxMana(15);
						player.setStr(20);
						player.setAgility(10);
						player.setIntelligence(5);
						player.setEndurance(15);
						player.setFaith(0);
						//TEMPORARIO
							player.setDamage(15);
							player.setDefense(20);
							player.setBaseDefense(20);
							player.setEvasion(5);
							player.setCriticalChance(10);
							player.setWeapon(equip.addItem("Wooden Sword", "Sword", 5));
							player.setShield(equip.addItem("Wooden Shield", "Shield", 5, 1f, 1f, 1f, 1f, 1f, 1f, 1f));
						//FIM TEMPORARIO
						player.setFireResist(0);
						player.setPoisonResist(0);
						player.setBleedResist(0);
						player.setIceResist(0);
						player.setLightningResist(0);
						player.setPhysicalResist(0);
						player.setCurseResist(0);
						
						characterDone = true;
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						System.out.println("Você escolheu a vocação: Warrior.");
						System.out.println("");
					} else if (voc == 2) {
						player.setVocation("Mage");
						player.setHealth(80);
						player.setMaxHealth(80);
						player.setMana(50);
						player.setMaxMana(50);
						player.setStr(5);
						player.setAgility(10);
						player.setIntelligence(20);
						player.setEndurance(8);
						player.setFaith(0);
						//TEMPORARIO
							player.setDamage(13);
							player.setDefense(5);
							player.setBaseDefense(5);
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
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						System.out.println("Você escolheu a vocação: Mage.");
						System.out.println("");
					} else if (voc == 3) {
						player.setVocation("Archer");
						player.setHealth(100);
						player.setMaxHealth(100);
						player.setMana(25);
						player.setMaxMana(25);
						player.setStr(10);
						player.setAgility(20);
						player.setIntelligence(10);
						player.setEndurance(10);
						player.setFaith(0);
						//TEMPORARIO
							player.setDamage(15);
							player.setDefense(10);
							player.setBaseDefense(10);
							player.setEvasion(10);
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
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						System.out.println("Você escolheu a vocação: Archer.");
						System.out.println("");
					} else if (voc == 4) {
						player.setVocation("Cleric");
						player.setHealth(110);
						player.setMaxHealth(110);
						player.setMana(35);
						player.setMaxMana(35);
						player.setStr(15);
						player.setAgility(10);
						player.setIntelligence(10);
						player.setEndurance(12);
						player.setFaith(20);
						//TEMPORARIO
							player.setDamage(12);
							player.setDefense(12);
							player.setBaseDefense(12);
							player.setEvasion(7);
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
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						System.out.println("Você escolheu a vocação: Cleric.");
						System.out.println("");
					} else if (voc == 5){
						characterDone = false;
					} else {
						System.out.println("Vocação inválida. Digite apenas o número.");
						characterDone = false;
					}
					//INICIAR O JOGO
					while (!exit) {
						Util util = new Util();
						
						if (player.getHealth() > 0) {
							util.showStats(player);
							System.out.println("");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						
						int optTavern = -1;
						
						if (player.getHealth() > 0) {
							optTavern = util.tavernMenu(player, scanInt);
							System.out.println("Aguarde...");
						}
						
						if (optTavern == 1) {
							int fightCount = 3;
							
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							
							//INICIA UMA BATALHA
							while (fightCount > 0 && player.getHealth() > 0) {
								Event ev = new Event();
								Enemy mob = ev.spawnMob(player.getLevel());
								
								System.out.println("Você se deparou com um " + mob.getName() + "!");
								
								try {
									Thread.sleep(1500);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								ev.battle(player, mob, scanInt);
								player.setDefense(player.getBaseDefense());
								fightCount--;
							}
							fightCount = 3;
							
							//ACIONADO QUANDO O PLAYER MORRE
							if (player.getHealth() <= 0) {
								int continuar = -1;
								
								System.out.print("Deseja continuar jogando? 1 - Sim / 2 - Não: ");
								continuar = scanInt.nextInt();
								
								if (continuar == 1) {
									player.setHealth(player.getMaxHealth());
									player.setDefense(player.getBaseDefense());
								} else if (continuar == 2) {
									exit = true;
									break;
								} else {
									System.out.println("Opção inválida.");
								}
							}
							
						} else if (optTavern == 2) {
							if (player.getGold() >= 10) {
								player.setGold(player.getGold() - 10);
								player.rest(player);
							} else {
								System.out.println("Você não possui gold suficiente.");
							}
						} else if (optTavern == 3) {
							//SALVAR PROGRESSO
							break;
						} else if (optTavern == 4) {
							//CHAMAR METODO DE QUESTS
							break;
						} else if (optTavern == 5) {
							//LOJA
							while (true) {
								int optLoja = util.lojaMenu(scanInt);
								
								if (optLoja == 1) {
									if (player.getGold() >= 50) {
										Item potion = new Item();
										player.setGold(player.getGold() - 50);
										player.getInventory().add(potion.addPotion(5, "Health Potion", "Potion", 50, 0, 1));
										System.out.println("Você comprou Poção de Vida(1x).");
									} else {
										System.out.println("Você não possui gold suficiente.");
									}
								} else if (optLoja == 2) {
									if (player.getGold() >= 35) {
										Item potion = new Item();
										player.setGold(player.getGold() - 35);
										player.getInventory().add(potion.addPotion(6, "Mana Potion", "Potion", 0, 30, 1));
										System.out.println("Você comprou Poção de Mana(1x).");
									} else {
										System.out.println("Você não possui gold suficiente.");
									}
								} else if (optLoja == 3) {
									System.out.println("Volte sempre!");
									break;
								} else {
									System.out.println("Opção inválida.");
								}
							}							
						} else if (optTavern == 6) {
							//CHAMA O MÉTODO DE ACESSO AO INVENTÁRIO
						} else if (optTavern == 7){
							System.out.println("Até logo!");
							exit = true;
							break;
						} else {
							System.out.println("Opção da taverna inválida. Digite apenas o número.");
						}
					}
				} else if (optDifficulty == 2 && !characterDone) {
					//INSERIR MODIFICADORES DE DIFICULDADE
					break;
				} else if (optDifficulty == 3 && !characterDone) {
					//INSERIR MODIFICADORES DE DIFICULDADE
					break;
				} else if (optDifficulty == 4 && !characterDone) {
					dificultyDone = false;
				} else if (exit) {
					System.out.println("Fim de jogo.");
					break;
				} else {
					System.out.println("Opção inválida. Digite apenas o número.");
					break;
				}
			} else if (optMenu == 2) {
				//IMPLEMENTAR LOAD
			} else if (optMenu == 3) {
				System.out.println("Até logo!");
				break;
			} else {
				System.out.println("Opção inválida. Digite apenas o número.");
				break;
			}
		}
		scanInt.close();
		scanStr.close();
	}
}
