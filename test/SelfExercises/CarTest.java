package SelfExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void testThatCarCanBeCreated(){
     Car benz = new Car("G-390","2022",50.00);
     assertNotNull(benz);
    }

    @Test
    public void testThatCarAttributesAreProperlyInitialised(){
        Car benz = new Car("G-390","2022",50.00);
        assertEquals("G-390",benz.getModel());
        assertEquals("2022", benz.getYear());
        assertEquals(50.00, benz.getPrice());
    }

    @Test
    public void testThatOnlyPositiveAmountAreAllowedAsPrice(){
     Car benz = new Car("G-390", "2022",50.00);
     benz.setPrice(-22222000);
     assertEquals(45.00,benz.getPrice());
    }

    @Test
    public void testDiscount(){
        Car benz = new Car("G-390", "2022",50.00);
        benz.applyDiscount(10);
        assertEquals(45, benz.getPrice());
    }

    @Test
    public void testSetPriceApplesDiscount(){
     Car benz = new Car("G-390", "2022", 50.00);
     benz.setPrice(1000.00);
     assertEquals(900.00, benz.getPrice());
    }
}