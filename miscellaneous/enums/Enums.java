import model.Car;

public class Enums {

    public static void main(String[] args) {
        Car car = new Car("Nissan", 2020);
        car.drive(Car.TrafficLight.RED);
    }

}
