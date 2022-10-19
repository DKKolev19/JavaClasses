public class Car {
    private String brand;
    private String model;
    public void start(String brand,String model){
        this.brand = brand;
        this.model = model;
        System.out.println("The brand of the car is " + brand + " and the model is " + model);
    }
}
