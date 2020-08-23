package GuessingGameVer2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GameLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameLauncher gui = new GameLauncher();
		gui.go();
	}

	public void go() {
		Game myGame = new Game();
		myGame.setLocationCell();

		while (true) {

			
			try {
				System.out.println("Enter a number: ");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String guess = br.readLine();
				String result = myGame.checkYourself(guess);
				System.out.println(result);
				if (result.equals("kill")) {
					System.out.println("You took " + myGame.numOfGuesses + " guesses");
					break;
				} 
			} catch(Exception e){
				e.printStackTrace();
			}

		}
	}

}
