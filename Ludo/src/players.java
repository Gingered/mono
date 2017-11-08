import java.util.Scanner;

public class players {
	String name;

	int bot_movement(int bf) {
		for (bf = 14; bf < 160;) {
			int[] fields = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
					16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
					31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
					46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 1, 2,
					3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
					19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33,
					34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
					49, 50, 51, 52, 53, 54, 55, 56, 57 };

			Dice ludos = new Dice();
			System.out.print("Player 2 got a ");
			int num = ludos.ludoDice();
			if (num == 5) {
				if (bf < 9) {
					bf = 9;
				} else if (9 <= bf) {
					if (bf < 14) {
						bf = 14;
					}
				} else if (14 <= bf) {
					if (bf < 22) {
						bf = 22;
					}
				} else if (22 <= bf) {
					if (bf < 27) {
						bf = 27;
					}
				} else if (27 <= bf) {
					if (bf < 35) {
						bf = 35;
					}
				} else if (35 <= bf) {
					if (bf < 40) {
						bf = 40;
					}
				} else if (40 <= bf) {
					if (bf < 48) {
						bf = 48;
					}
				} else if (48 <= bf) {
					if (bf < 53) {
						bf = 53;
					}
				} else if (53 <= bf) {
					if (bf < 61) {
						bf = 61;
					}
				} else if (61 <= bf) {
					if (bf < 66) {
						bf = 66;
					}
				}

				else {
					num = 0;
				}
			}

			else if (num == 3) {
				if (bf < 6) {
					bf = 6;
				} else if (6 <= bf) {
					if (bf < 12) {
						bf = 12;
					}
				} else if (12 <= bf) {
					if (bf < 19) {
						bf = 19;
					}
				} else if (19 <= bf) {
					if (bf < 25) {
						bf = 25;
					}
				} else if (25 <= bf) {
					if (bf < 32) {
						bf = 32;
					}
				} else if (32 <= bf) {
					if (bf < 38) {
						bf = 38;
					}
				} else if (38 <= bf) {
					if (bf < 45) {
						bf = 45;
					}
				} else if (45 <= bf) {
					if (bf < 51) {
						bf = 51;
					}
				} else if (51 <= bf) {
					if (bf < 58) {
						bf = 58;
					}
				} else if (58 <= bf) {
					if (bf < 64) {
						bf = 64;
					}
				}

				else {
					num = 0;

				}

			}

			else {
				bf += num;
			}
			if (bf < 58) {
				System.out.println("Player2" + " is at " + fields[bf]);
			} else if (bf > 57 + 14) {
				System.out.println("Player2 is done!");
				break;
			}
			return bf;

		}
		return bf;
	}

}
