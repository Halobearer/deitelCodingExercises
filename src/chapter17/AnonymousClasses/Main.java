package chapter17.AnonymousClasses;

import chapter17.AnonymousClasses.CarMethod;
import chapter17.Toyota;

public class Main {
    public static void main(String[] args) {

        Toyota toyota = new Toyota();

        //ANONYMOUS CLASS
        CarMethod carMethod = new CarMethod() {

            //This Below is the Implementation of the  Anonymous class
            @Override
            public void stop() {
                System.out.println("Stop");
            }

            @Override
            public void move() {
                System.out.println("Move");
            }
        };
        toyota.move(carMethod);
        toyota.stop(carMethod);
    }
}
