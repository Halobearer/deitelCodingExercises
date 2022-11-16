package ClassExercises;

public class TestDrillerUtme {

    public int firstCopySet(int number) {
        if (number <= 4) {
            return number * 2000;
        }

        if (number >= 5 && number <= 9) {
            return number * 1800;
        }

        if (number >= 10 && number <= 29) {
            return number * 1600;
        }

        if (number >= 30 && number <= 49) {
            return number * 1500;
        }

        if (number >= 50 && number <= 99) {
            return number * 1300;
        }

        if (number >= 100 && number <= 199) {
            return number * 1200;
        }

        if (number >= 200 && number <= 499) {
            return number * 1100;
        }

        if (number >= 500) ;{
            return number * 1000;
        }
    }
}