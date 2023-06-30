package ChapterSixTest;

import ChapterSix.ClassExercises.CoinTossingGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CoinTossGameTest {

    private CoinTossingGame coinTossingGame; // we created this instance variable because we would be using the method
    // to create an object over and over again....

    @BeforeEach // We use before each because we want the JVM to run this method before any other method available
    public void setUp() {
        coinTossingGame = new CoinTossingGame(); // This is now the Object creation to be done @Before each codes run or test
    }

    @Test
    public void testThatGameExists() {
        //CoinTossingGame coinTossingGame = new CoinTossingGame();
        assertNotNull(coinTossingGame);
    }

    @Test
    public void testMenuOption() {
        String menu = CoinTossingGame.getGameMenu();
        assertTrue(menu.equals("""
                1. Toss coin
                2. Exit Game
                            
                """));
    }

    @Test
    public void testCoinFlip() {
        String outcome = coinTossingGame.flip();
        assertNotNull(outcome);
        assertTrue(outcome.equals("HEADS") || outcome.equals("TAILS"));
    }


    @Test
    public void testCountOutcome() {
        coinTossingGame.flip();
        assertTrue(coinTossingGame.getHeadsCount() == 1 || coinTossingGame.getTailsCount() == 1);
    }
}
