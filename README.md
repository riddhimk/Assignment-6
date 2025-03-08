# Assignment-6

## Overview  
This Java program demonstrates the **ABstract Classes** by modeling different types of ducks with interchangeable behaviors for **flying, quacking, and swimming**.  

## Features  
- Different types of ducks (**MallardDuck, RedHeadDuck, RubberDuck**)  
- Encapsulated behaviors:  
  - **Flying**: `Fly`, `NotFly`  
  - **Quacking**: `Quack`, `Squeak`, `Mute`  
  - **Swimming**: `Swim`, `Float`, `Drown`  
- **Ducks can change behaviors dynamically**

## Class Structure  

### `Duck.java`  
- **Abstract base class** for all ducks  
- Holds references to `FlyBehavior`, `QuackBehavior`, and `SwimBehavior`  
- Methods:  
  - `performFly()`: Executes the fly behavior  
  - `performQuack()`: Executes the quack behavior  
  - `performSwim()`: Executes the swim behavior  
  - `setFlyBehavior()`, `setQuackBehavior()`, `setSwimBehavior()`: Allow dynamic behavior changes  

### `FlyBehavior.java` (Interface)  
- Defines `fly()` method  
- Implementations:  
  - `Fly`: Duck flies normally  
  - `NotFLy`: Duck cannot fly

### `QuackBehavior.java` (Interface)  
- Defines `quack()` method  
- Implementations:  
  - `Quack`: Normal duck quack  
  - `Squeak`: Rubber duck squeak  
  - `Mute`: No quacking  

### `SwimBehavior.java` (Interface)  
- Defines `swim()` method  
- Implementations:  
  - `Swim`: Normal swimming  
  - `Float`: Passive floating  
  - `Drown`: Sinks instead of swimming  

### `MallardDuck.java`, `RedHeadDuck.java`, `RubberDuck.java`  
- Each duck **inherits from `Duck`** and assigns specific behaviors  

### `Main.java`  
- Creates instances of different ducks  
- Demonstrates their behaviors  
- Allows **dynamic behavior changes**  

## Duck Attributes
| Duck Type      | Flying Behavior | Swimming Behavior | Quacking Behavior |
|---------------|---------------|----------------|----------------|
| **MallardDuck** | Can fly       | Swims with legs | Quacks         |
| **RedHeadDuck** | Can fly       | Swims with legs | Quacks         |
| **RubberDuck**  | Cannot fly    | Floats          | Squeaks        |
| **DecoyDuck**   | Cannot fly    | Floats          | Mute           |
