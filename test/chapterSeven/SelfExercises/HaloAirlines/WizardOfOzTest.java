package chapterSeven.SelfExercises.HaloAirlines;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardOfOzTest {

    WizardOfOz airlines;

    @BeforeEach
    public void setUp() {
        boolean[] seats = new boolean[10];
    }


    @Test
    public void testThatSeatsAreFalseAtCreation() {
        WizardOfOz airlines = new WizardOfOz();
        airlines.isFalse();
        System.out.println(airlines);
        assertFalse(airlines.isFalse());
    }

    @Test
    public void testThatArraySizeIs10() {
       // WizardOfOz airlines =
    }
}