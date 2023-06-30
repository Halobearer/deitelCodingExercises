package chapter17;

import chapter17.AnonymousClasses.CarMethod;

public class Toyota {

    public void move(CarMethod carMethod){
        carMethod.move();
    }

    public void stop(CarMethod carMethod){
        carMethod.stop();
    }
}
