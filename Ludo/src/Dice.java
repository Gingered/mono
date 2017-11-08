public class Dice {
	public int ludoDice() {
		int num = (int) Math.ceil(Math.random() * 6);
		
		if(num == 3) {
			System.out.println("star");
			
		}
		else if(num == 5) {
			System.out.println("globe");
			
		}
		else if(num == 1){
			System.out.println("1");
		}
		else if(num == 2){
			System.out.println("2");
		}
		else if(num == 4){
			System.out.println("4");
		}
		else if(num == 6){
			System.out.println("6");
		}
		return num;
	}
}
