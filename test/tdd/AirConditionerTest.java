package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AirConditionerTest {


    @Test
    public void turnOnTest() {
        //given that I have an AC
        AirConditioner panasonic = new AirConditioner();
        //when the AC is off
        panasonic.setTurnOff(true);
        //when I turn it on
        panasonic.setTurnOn(true);
        //check that it is on
        boolean powerOn = panasonic.getTurnOn();

        assertTrue(powerOn);
    }

    @Test
    public void turnOffTest() {
        //given that I have an AC
        AirConditioner panasonic = new AirConditioner();
        //when the AC is on
        panasonic.setTurnOn(true);
        //when I turn it off
         panasonic.setTurnOff(true);
        //check that it is on
        boolean poweroff = panasonic.getTurnOff();
        assertTrue(poweroff);
    }
    @Test
    public void increaseTemperature() {
        //given that I have an AC
        AirConditioner panasonic = new AirConditioner();
        //when the AC is on
        panasonic.setTurnOn(true);
        //when Initial temperature is
        panasonic.setTemperature(17);
        //when I increase temperature
        panasonic.increaseTemperature(10);
        //check that the temperature is 27
        int temperature = panasonic.getTemperature();
        assertEquals(27,temperature);
    }

    @Test
    public void decreaseTemperature() {
        //given that I have an AC
        AirConditioner panasonic = new AirConditioner();
        //when the AC is on
        panasonic.setTurnOn(true);
        //when the Initial temperature is
        panasonic.setTemperature(27);
        //when I Decrease temperature
        panasonic.decreaseTemperature(10);
        //check that the temperature is 17
        int temperature = panasonic.getTemperature();
        assertEquals(17, temperature);
    }
    @Test
    public void temperatureBeyond30() {
        //given that I have an AC
        AirConditioner panasonic = new AirConditioner();
        //when the AC is on
         panasonic.setTurnOn(true);
        //when the initial temperature is
        panasonic.setTemperature(12);
        //when I increase temperature beyond 30
        panasonic.increaseTemperature(30);
        //check that the temperature is 30
        int temperature = panasonic.getTemperature();
        assertEquals(30, temperature);
    }
    @Test
    public void temperatureBelow16() {
         //given that I have an AC
        AirConditioner panasonic = new AirConditioner();
        //when the AC is on
        panasonic.setTurnOn(true);
        //when the initial temperature is
        panasonic.setTemperature(28);
        //when I Decrease temperature below 16
        panasonic.decreaseTemperature(16);
        //check that temperature is 16
        int temperature = panasonic.getTemperature();
        assertEquals(16, temperature);
    }
}

