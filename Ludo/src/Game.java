import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Dice ludo = new Dice();

		Scanner player = new Scanner(System.in);

		System.out.println("Who (Do you say 'whom' there?) is playing today?");

		String line = player.nextLine();

		System.out.println("Well hello there " + line + ". I am Derrick. ");

		Scanner color = new Scanner(System.in);

		System.out
				.println("I'll be your host tonight, and I dare say it'll be fantastic. \nWhat persona will you take tonight? Blue, green, red or maybe the dangerous yellow?");

		while (0 < 2) {
			String colour = color.nextLine();

			String coloure = colour.toUpperCase();

			if (coloure.equals("BLUE")) {
				String playerName = coloure + " " + line;
				System.out
						.println("You're "
								+ playerName
								+ ". Are you ready to battle RED Rider, GREEN Geordie and YELLOW Yeat? \nThe Game can be stopped at any time by pressing 'STOP'.\nI hope you enjoy yourself!\nWrite 'Start' to begin.");
				players RED = new players();
				players GREEN = new players();
				players YELLOW = new players();
				break;
			} else if (coloure.equals("RED")) {
				String playerName = coloure + " " + line;
				System.out
						.println("You're "
								+ playerName
								+ ". Are you ready to battle BLUE Baby, GREEN Geordie and YELLOW Yeat? \nThe Game can be stopped at any time by pressing 'STOP'.\nI hope you enjoy yourself!\nWrite 'Start' to begin.");
				players BLUE = new players();
				players GREEN = new players();
				players YELLOW = new players();
				break;
			} else if (coloure.equals("YELLOW")) {
				String playerName = coloure + " " + line;
				System.out
						.println("You're "
								+ playerName
								+ ". Are you ready to battle BLUE Baby, GREEN Geordie and RED Rider? \nThe Game can be stopped at any time by pressing 'STOP'.\nI hope you enjoy yourself!\nWrite 'Start' to begin.");
				players RED = new players();
				players GREEN = new players();
				players BLUE = new players();
				break;
			} else if (coloure.equals("GREEN")) {
				String playerName = coloure + " " + line;
				System.out
						.println("You're "
								+ playerName
								+ ". Are you ready to battle BLUE Baby, YELLOW Yeat and RED Rider? \nThe Game can be stopped at any time by pressing 'STOP'.\nI hope you enjoy yourself!\nWrite 'Start' to begin.");
				players RED = new players();
				players BLUE = new players();
				players YELLOW = new players();
				break;
			} else {
				System.out.println("Will you please enter something valid.");
			}
		}

		Scanner starter = new Scanner(System.in);
		String random = starter.nextLine();

		Board playingBoard = new Board();

		while (2 < 3) {
			System.out
					.println("You are in your homebase and you need to get out.\nTo get out you either need a Globe or a 6. You have 3 tries to get either before it is the opponents turn.\nEnter 'p' to play");
			Scanner play = new Scanner(System.in);
			String playing = play.nextLine();
			Board getOut = new Board();
			getOut.getting_out_of_base();
			System.out.println("Press enter to roll the dice again.");
			break;
		}
		int r = 1;
		for (int af = 0; af < 58; r++) {
			System.out.println("Round " + r + ".");
			Scanner play = new Scanner(System.in);
			String playing = play.nextLine();
			Dice ludos = new Dice();
			System.out.print("You got a ");
			int num = ludos.ludoDice();
			if (num == 5) {
				if (af < 9) {
					af = 9;
				} else if (9 <= af) {
					if (af < 14) {
						af = 14;
					}
				} else if (14 <= af) {
					if (af < 22) {
						af = 22;
					}
				} else if (22 <= af) {
					if (af < 27) {
						af = 27;
					}
				} else if (27 <= af) {
					if (af < 35) {
						af = 35;
					}
				} else if (35 <= af) {
					if (af < 40) {
						af = 40;
					}
				} else if (40 <= af) {
					if (af < 48) {
						af = 48;
					}
				} else {
					num = 0;
				}
			}

			else if (num == 3) {
				if (af < 6) {
					af = 6;
				} else if (6 <= af) {
					if (af < 12) {
						af = 12;
					}
				} else if (12 <= af) {
					if (af < 19) {
						af = 19;
					}
				} else if (19 <= af) {
					if (af < 25) {
						af = 25;
					}
				} else if (25 <= af) {
					if (af < 32) {
						af = 32;
					}
				} else if (32 <= af) {
					if (af < 38) {
						af = 38;
					}
				} else if (38 <= af) {
					if (af < 45) {
						af = 45;
					}
				} else if (45 <= af) {
					if (af < 51) {
						af = 51;
					} else {
						num = 0;
					}
				}

			}

			else {
				af += num;
			}
			if (af < 58) {
				System.out.println("You are at " + af);

			} else if (af > 57) {
				System.out.println("You WON!");
				break;
			}
			int[] fields = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
					16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
					31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
					46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 1, 2,
					3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
					19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33,
					34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
					49, 50, 51, 52, 53, 54, 55, 56, 57 };
			players player2 = new players();
			int bf = 0;
			if (af == fields[bf]) {
				System.out.println("You destroyed Player2");
				bf = 0;
			}
			player2.bot_movement(bf);

			if (af == fields[bf]) {
				System.out.println("You got send home!");
				af = 0;
			}

		}

	}

}
