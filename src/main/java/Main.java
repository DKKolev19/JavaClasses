import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Scanner scan = new Scanner(System.in);
        String brand = scan.nextLine();
        String model = scan.nextLine();
        car.start(brand, model);
    }
}
