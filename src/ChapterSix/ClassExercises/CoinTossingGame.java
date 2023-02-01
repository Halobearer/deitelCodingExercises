package ChapterSix.ClassExercises;

import ChapterSix.ClassExercises.Enums.Coin;

import java.security.SecureRandom;
public class CoinTossingGame {

    private int headsCount;
    private int tailsCount;
    private Coin coin;

    public static String getGameMenu() {
    return """
            1. Toss Coin
            2. Exit Game
            """;
    }

    public String flip() {
    int randomNumber = generateRandomNumberBetweenZeroAndOne();
    if (randomNumber == 0){
        headsCount++;
        return coin.HEADS.name();
    }
    tailsCount++;
    return coin.TAILS.name();
    }

    public int getHeadsCount(){
        return headsCount;
    }
    public int getTailsCount(){
        return tailsCount;
    }

    private static int generateRandomNumberBetweenZeroAndOne(){
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(2);
    }

    public void displayGameResult(){

    }
}
