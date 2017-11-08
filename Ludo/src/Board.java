public class Board {
	void getting_out_of_base() {

		while (3 < 7) {
			Dice ludo = new Dice();
			int num = ludo.ludoDice();
			int i = 0;
			for (i = 1; i < 4; i++) {
				if (num == 5 || num == 6) {
					System.out.println("You got out of your base");
					i += 15;
				} else if (i == 4) {
					System.out.println("It's the opponents' turn.");
					System.out.println("");
				} else {
					System.out.println("You didn't get them");

				}
			}
			if (i > 10) {
				break;
			}

		}

	}

}
