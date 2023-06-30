package tdd;

public class AutomaticBike {

    private boolean isOn;
    private boolean isOff;
    private int speed;

    public void setOn(boolean trueFalse) {
        isOn = trueFalse;
    }

    public boolean getOn() {
        return isOn;
    }

    public void setOff(boolean trueFalse) {
        isOff = trueFalse;
    }

    public boolean getOff() {
        return isOff;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
    public void setAccelerate(int gear) {
            speed = speed + gear;
        }
    public int getAccelerate() {
        return speed;
        }
    public void setDecelerate(int decelerate) {
        speed = speed - decelerate;

    }
    public int getDecelerate() {
        return speed;
    }

}

