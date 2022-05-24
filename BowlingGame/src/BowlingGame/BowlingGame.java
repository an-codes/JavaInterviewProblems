package BowlingGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BowlingGame {

	// Parameters
	private int rollIndex;
	private int rollsArray[];
	private HashMap<String, int[]> rollsTracker = new HashMap<String, int[]>();
	private HashMap<String, Integer> scoreBoard = new HashMap<String, Integer>();
	
	// Add a new player
	public void addPlayer(String name) {
		scoreBoard.put(name, 0);
	}
	
	public void roll(String name, int...rolls) { // ... means that zero or more String objects (or a single array of them) may be passed as the argument(s) for that method.
		rollIndex = 0;
		rollsArray = new int[21];
		for (int pinsDown : rolls) {
			rollsArray[rollIndex++] = pinsDown;
			rollsTracker.put(name, rollsArray);
			
		}
	}

	
	public HashMap<String, Integer> finalScore() {
	
		for (Entry<String, int[]> entry: rollsTracker.entrySet()) {
			String playerName = entry.getKey();			
			int score = 0;
			rollIndex = 0;
			int [] rollsPlayer = entry.getValue();
			
		for (int frame = 0; frame < 10; frame++) {
			if(isStrike(rollsPlayer, rollIndex)) {
				score += 10 + rollsPlayer[rollIndex+1] + rollsPlayer[rollIndex+2];
				rollIndex++;
			} else if (isSpare(rollsPlayer, rollIndex)) {
				score += 10 + rollsPlayer[rollIndex+2];
				rollIndex += 2;
			} else {
				score += rollsPlayer[rollIndex] + rollsPlayer[rollIndex+1];
				rollIndex += 2;
			}
		}
		//add a score and a player to the score board
		scoreBoard.put(playerName, score);
	}
		return scoreBoard;
	}
	
	
	private boolean isStrike(int[] rollsPlayer, int rollIndex) {
		return rollsPlayer[rollIndex] == 10;
	}

	private boolean isSpare(int[] rollsPlayer, int rollIndex) {
		return rollsPlayer[rollIndex] + rollsPlayer[rollIndex+1] == 10;
	}

	// print score board
	public HashMap<String, Integer> printScores() {
		return scoreBoard;
	}
	
	

	
	
	public String getWinner() {
		String winnerName;
		int winnerScore;
		
		// Use collections to find the max value within the HashMap
		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : scoreBoard.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		
		winnerName = maxEntry.getKey();
		winnerScore = maxEntry.getValue();
		
		System.out.println("The winner is " + winnerName + " with the total of " + winnerScore + " points! Congratulations!");
		return (winnerName + " = " + winnerScore);
	} 
}
