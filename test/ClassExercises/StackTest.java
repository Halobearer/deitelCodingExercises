package ClassExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack newStack;
    @BeforeEach
    public void setUp() {
        newStack = new Stack(5);
    }

    @Test
    public void newStackIsEmptyTest() {
        Stack newStack = new Stack(5);
        assertTrue(newStack.isEmpty());
    }

    @Test
    public void pushXStackIsNotEmptyTest(){
        newStack.push(3);
        assertFalse(newStack.isEmpty());
    }

    //@Test
   // public void pushX_popX
}