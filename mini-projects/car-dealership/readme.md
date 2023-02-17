## Another Dealership Project

The most important thing in this project how to deal with mutable array objects that have nested mutable array objects inside them.

Check [Dealership.java](./Dealership.java) for a detailed explanation of the issue.

#### Working

- Create an array of cars
- Create a **dealership object** with that array of cars
- Welcome user and show them all the cars by printing **dealership object**
- Ask which car they want to buy using `scanner.nextInt()`
- Sell the car to the user by using the **sell method** of Dealership class which in turns calls the **drive method** of the Car class
