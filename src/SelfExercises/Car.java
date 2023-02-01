package SelfExercises;

public class Car {

    private String model;
    private String year;
    private double price;
    //unnecessary
    public Car(){}
//////////////////////////

    public Car(String model, String year, double price) {
        //this is setting....
        this.model = model;
        this.year = year;
        this.price = price;
    }
    //this is getting.......
    public String getModel(){
        return model;
    }

    public String getYear(){
        return year;
    }
    public double getPrice(){

        return price;
    }
    //this is aso setting......
    public void setModel(String model) {

        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(double price) {
       if (price > 0) this.price = price;
       applyDiscount(10);
    }


    public void applyDiscount(double discountRate) {
        double discount = (discountRate / 100) * price;
            price = price - discount;

    }
}
