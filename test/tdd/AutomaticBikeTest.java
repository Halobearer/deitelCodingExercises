package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AutomaticBikeTest {

    @Test
    public void turnOnTest() {
        //given that I have a bike
        AutomaticBike gokada = new AutomaticBike();
        //when the bike is off
        gokada.setOff(true);
        //when I turn it on
        gokada.setOn(true);
        //check that it is on
        boolean powerOn = gokada.getOn();
        assertTrue(powerOn);
    }

    @Test
    public void turnOffTest() {
        //given that I have a bike
        AutomaticBike gokada = new AutomaticBike();
        //when the bike is on
        gokada.setOn(true);
        //when I turn it on
        gokada.setOff(true);
        //check that it is on
        boolean powerOn = gokada.getOff();
        assertTrue(powerOn);
    }

    @Test
    public void accelerateGearOneTest() {
        //given that I have a bike
        AutomaticBike gokada = new AutomaticBike();
        //when the bike is on
        gokada.setOn(true);
        //when the bike is on Gear one
        gokada.setSpeed(15);
        //when I accelerate
        gokada.setAccelerate(1);
        //check that speed is accurate
        int gokadaIsAccelerating = gokada.getAccelerate();
        assertEquals(16, gokadaIsAccelerating );
    }
    @Test
    public void accelerateGearTwoTest() {
        //given that I have a bike
        AutomaticBike gokada = new AutomaticBike();
        //when the bike is on
        gokada.setOn(true);
        //when the bike is on Gear two
        gokada.setSpeed(24);
        //when I accelerate
        gokada.setAccelerate(2);
        //check that speed is accurate
        int gokadaIsAccelerating = gokada.getAccelerate();
        assertEquals(26, gokadaIsAccelerating);
    }

    @Test
    public void accelerateGearThreeTest () {
        //given that I have a bike
        AutomaticBike gokada = new AutomaticBike();
        //when the bike is on
        gokada.setOn(true);
        //when the bike is on Gear three
        gokada.setSpeed(28);
        //when I accelerate
        gokada.setAccelerate(3);
        //check that speed is accurate
        int gokadaIsAcceerating = gokada.getAccelerate();
        assertEquals(31, gokadaIsAcceerating);

    }

    @Test
    public void accelerateGearFourTest() {
        //given that I have a bike
        AutomaticBike gokada = new AutomaticBike();
        //when the bike is on
        gokada.setOn(true);
        //when the bike is on Gear four
        gokada.setSpeed(24);
        //when I accelerate
        gokada.setAccelerate(4);
        //check that speed is accurate
        int goakdamove = gokada.getAccelerate();
        assertEquals(28, gokada.getAccelerate());


    }
    @Test
    public void decelerateGearOneTest() {
        //given that I have a bike
        AutomaticBike gokada = new AutomaticBike();
        //when the bike is on
        gokada.setOn(true);
        //when the bike is one Gear one
        gokada.setSpeed(14);
        //when I decelerate
        gokada.setDecelerate(1);
        //check that speed is accurate
        int gokadawhy = gokada.getDecelerate();
        assertEquals(13,gokadawhy);
    }


}