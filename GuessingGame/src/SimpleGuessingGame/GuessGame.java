package SimpleGuessingGame;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;

	// Player doan dung hay sai
	boolean check1;
	boolean check2;
	boolean check3;

	int numToGuess;
	//Ham startGame()
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		while (true) {
			System.out.println("I'm thinking of a number between 0 and 9...");
			numToGuess = (int) (Math.random() * 10);
			System.out.println("Number to guess is " + numToGuess);

			p1.guess();
			p2.guess();
			p3.guess();
			
			
			
			check1 = checkGuess(p1.getNumber());
			check2 = checkGuess(p2.getNumber());
			check3 = checkGuess(p3.getNumber());
			
			System.out.println("Player one guess: " + p1.getNumber());
			System.out.println("Player two guess: " + p2.getNumber());
			System.out.println("Player three guess: " + p3.getNumber());
			
			if(check1 ||  check2 ||  check3) {
				System.out.println("We have a winner");
				System.out.println("Player one got it right? " + check1);
				System.out.println("Player one got it right? " + check2);
				System.out.println("Player one got it right? " + check3);
				System.out.println("Game is over!");
				break;
			} else {
				System.out.println("Player will have to try again");					
			}
		}

	} //End startGame()
	
	public boolean checkGuess(int userGuess) {
		if (userGuess == numToGuess) {
			return true;
		}
		else return false;
	}
}
