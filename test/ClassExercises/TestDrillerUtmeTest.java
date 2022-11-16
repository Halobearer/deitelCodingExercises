package ClassExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestDrillerUtmeTest {

    @Test
    public void OneToFourCopiesTest(){
     TestDrillerUtme exam = new TestDrillerUtme();
     int result = exam.firstCopySet(800);
     assertEquals(800_000, result);

    }
}