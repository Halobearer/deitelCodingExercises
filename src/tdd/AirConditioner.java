package tdd;

public class AirConditioner {

    private boolean isOn;
    private boolean isOff;
    private int temperature;


    public void setTurnOn(boolean trueFalse) {
        isOn = trueFalse;
    }

    public boolean getTurnOn() {
        return isOn;
    }

    public void setTurnOff(boolean trueFalse) {
        isOff = trueFalse;
    }

    public boolean getTurnOff() {
        return isOff;
    }

    public void setTemperature(int degrees) {
        if (degrees <= 30 & degrees >= 16) {
            temperature = degrees;
        }
    }

    public void increaseTemperature(int degrees) {
        temperature = temperature + degrees;
    }

    public void decreaseTemperature(int degrees) {
        temperature = temperature - degrees;
    }

    public int getTemperature() {
        return temperature;
    }
}




