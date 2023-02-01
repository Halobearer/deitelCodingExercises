package SelfExercises;

public class CarApplication {
    public static void main(String[] args) {
        Car bmw = new Car("A5", "2021", 3000000.00);
        Car toyota = new Car("Camry", "2021",5000000.00);
        System.out.println(bmw.getPrice());
        System.out.println(toyota.getPrice());

    }
}
