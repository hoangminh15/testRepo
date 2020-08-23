package SimpleGuessingGame;

public class Player {
	private int number = 0;
	
	public void guess() {
		int ran = (int)(Math.random() * 10);
		number = ran;
	}
	
	public int getNumber() {
		return number;
	}
}
