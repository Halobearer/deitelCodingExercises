package SelfExercises;

public class PhraseOmatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24 / 7", "multiTier", "30, 000 foot", "B - to - B", "win - win", "frontend",
                "web - based", "pervasive", "smart", "sixsigma", "critical - path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "brother", "neglect", "stopper", "pushed"};
        String[] wordListThree = {"space ship", "Galaxy", "Diplomat", "case study"};
        // To figure out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        //  To generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        // now build a phrase
        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];
        // print out the phrase
        System.out.println("What we need is a " + phrase);
    }
}
