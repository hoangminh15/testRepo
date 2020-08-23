package GuessingGameVer2;

import java.util.*;

public class Game {
	ArrayList<Integer> list = new ArrayList<Integer>();
	int numOfGuesses = 0;
	

	// Set cac cell
	public void setLocationCell() {
		int num = (int) (Math.random() * 4);
		list.add(num); // ~list[0]
		list.add(num + 1); // ~list[1]
		list.add(num + 2); // ~list[2]

	}

	// check guess cua nguoi choi
	public String checkYourself(String guess) {
		int userGuess = Integer.parseInt(guess);
		
		String result = "miss";
		
		for (int i : list) {
			numOfGuesses++;
			if (i == userGuess) {
				

				list.remove(i);
				result = "hit";
			}

			if (list.isEmpty()) {
				result = "kill";
				break;
			}
		} // End for loop
		return result; 
	}
}
