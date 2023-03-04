## Three Layer Design

1. Presentation

   - Responsible for presenting information to user
   - Direct calls shouldn't be made to repository layer from here

1. Service

   - Middleman between the presentation layer and the repository
   - Contains the business logic of the app

1. Repository

   - Only layer that can access the data store
   - Can perform CRUD operations to the data store

## POJO

- Plain Old Java Object
- Represent data that will be saved to a database
- They don't have any special behavior unlike _service layer_

## Interface

- Contract of Behavior
- Classes with similar behavior should implement an interface
- Every class that implements an interface is required too override all the mentioned methods of the interface
- So if we 2 classes have some similar methods, we can specify them to implement a single interface

#### How is Interface different form Inheritance?

- Inheritance allows a subclass to inherit all the features of the parent class, while implementing an interface only requires the class to provide an override the methods specified in the interface.
- A class can only inherit from one parent class, but it can implement multiple interfaces.
- In other words, implementing an interface is like agreeing to a contract that specifies certain methods must be implemented, while inheritance is like inheriting all the belongings of a family member.
