// import java.util.Arrays;

public class Dealership {
  private Car[] cars;

  public Dealership(Car[] cars) {
    // this.cars = Arrays.copyOf(cars, cars.length);
    // this will create a new copy of cars array but it will not create copies of
    // the
    // objects inside the array and they will be the same objects as in the original
    // array and hence the same references

    // better way to do it is to create a new array of cars and then create new
    // objects
    // for each car in the original array and copy the values from the original
    // objects
    // to the new objects
    this.cars = new Car[cars.length];
    for (int i = 0; i < cars.length; i++) {
      this.cars[i] = new Car(cars[i]); // new object created with copy constructor
    }

    // If we don't do this, then every time we update any element in the cars array,
    // it
    // will also update `this.cars` array in the Dealership class since the elements
    // in
    // the cars array will have the same references as the elements in the
    // `this.cars` array
  }

  public String toString() {
    String temp = "";
    for (int i = 0; i < this.cars.length; i++) {
      temp += "Parking Spot: " + i + "\n";
      String carDescription = this.cars[i].toString();
      temp += carDescription + "\n";
    }
    return temp;
  }

  public void sellCar(int index) {
    this.cars[index].drive();
    // select the car at the index and call the drive method on it
    // Nissan.drive();
    // Driving a Blue Nissan...
  }
}
