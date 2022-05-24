package BowlingGame;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

	private BowlingGame game;

	@Before
	public void setUp() throws Exception {
		game = new BowlingGame();
	}
	
	
	
	
	@Test
	public void canAddPlayer() {
		HashMap<String, Integer> expected = new HashMap<String, Integer>();
		
		game.addPlayer("Anna");
		expected.put("Anna", 0);


        //1. Test equal, ignore order
         assertEquals(expected, game.printScores());

        //2. Test size
        assertEquals(1, game.printScores().size());

	}
	
	@Test
	public void canAddMultiplePlayer() {
		HashMap<String, Integer> expected = new HashMap<String, Integer>();
		
		game.addPlayer("Anna");
		game.addPlayer("Jenny");
		game.addPlayer("Phil");

		expected.put("Anna", 0);
		expected.put("Jenny", 0);
		expected.put("Phil", 0);

        //1. Test equal, ignore order
		assertEquals(expected, game.printScores());

        //2. Test size
		assertEquals(3, game.printScores().size());

	}

	@Test
	public void canScoreGutterGame() {
		HashMap<String, Integer> expected = new HashMap<String, Integer>();

		game.roll("Anna", 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		expected.put("Anna", 0);
		assertEquals(expected, game.finalScore());
	}
	
	@Test
	public void canScoreGameOfOnes() {
		HashMap<String, Integer> expected = new HashMap<String, Integer>();

		game.roll("Ewa", 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
		game.roll("Matt", 5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
		
		expected.put("Ewa", 20);
		expected.put("Matt", 16);
		
		assertEquals(expected, game.finalScore());
	}
	
	@Test
	public void canFindWinner() {

		game.roll("Ewa", 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
		game.roll("Matt", 10, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 10, 1,0, 0,0);
		
		game.finalScore();
		
		assertEquals("Matt = 28", game.getWinner());
	
	}	
}