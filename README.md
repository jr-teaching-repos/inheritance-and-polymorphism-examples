# Inheritance and Polymorphism Mini Exercises

This repository contains example solutions to mini-exercises that teach Inheritance and Polymorphism concepts.


## Example Hierarchy and Members

```
KitchenTool
    int costInCents
    boolean isClean
    wash()
    pickUp()
    
        Knife
            boolean isSerated
            double lengthOfBladeInInches
            void sharpen()
            void cutSomething()
            
        Plate
            boolean isRound
            String color
            void spin()
            void breakPlate()
    
ingredient.Ingredient
    boolean requiresRefridgeration
    boolean isExpired
    addWater()
    applyHeat()

        jelly.Jelly
            String brand
            String flavor
            openJar()
            checkIfLidPopped()
    
        PeanutButter
            boolean isCrunchy
            boolean isOrganic
            mixInOil()
            addChocolate()
    
        Bread
            boolean isWholeWheat
            int slicesLeftInLoaf
            removeHeel()
            toastBread()
```

## Mini-Exercise Instructions

```

---------- Mini-Exercise 1

Consider making a PB&J sandwich (again...).

You have the following categories:

  KitchenTool (what is common between knifes and plates?)
    Knife
    Plate

  Ingredient (what is common between these ingredients?)
    Jelly
    PeanutButter
    Bread

Add at least two characteristics and two actions relevant to each thing.



---------- Mini-Exercise 2

Create Java classes for the following:

  KitchenTool
    Knife (should extend from KitchenTool)
    Plate (should extend from KitchenTool)

  Ingredient
    Jelly (should extend from Ingredient)
    PeanutButter (should extend from Ingredient)
    Bread (should extend from Ingredient)

Add the variables and methods (two each per class) to the classes. To keep things simple enough, the methods can be void and simply sout out simple messages about what the method is doing (no need to manipulate the variables).



---------- Mini-Exercise 3

- add a void method, throwAway, to your Ingredient class that souts out "Throwing away ingredient..."
- override the method, throwAway, in your Jelly, PeanutButter, and Bread classes to sout out a more specific message (e.g. "Throwing away Jelly...", etc.)
- add another method to the KitchenTool class and override it in the Knife and Plate classes.



---------- Mini-Exercise 4

- add a protected integer property to Ingredient of calories
- add a method to the Jelly class that prints out the calories
- does the code work if you change the visibility of the calories to public? Private?
- create a package called "jelly" and place the Jelly class in it 
- create a package called "ingredient" and place the Ingredient class in it
- experiment with public, private, protected visibility for calories



---------- Mini-Exercise 5

- add a constructor to KitchenTool that sets all properties
- resolve the compile error in the subclasses by adding a default constructor to KitchenTool
- remove the default constructor and add a constructor to the child classes that calls the super constructor and sets the child class properties for Knife and Plate



---------- Mini-Exercise 6

- create a class, IngredientTest, that has a main method
- add a static void method, throwAwayIngredient that takes in an Ingredient instance and invokes the throwAway method
- instantiate an instance of Jelly, PeanutButter, and Bread stored in type Ingredient
- call the throwAwayIngredient() method multiple times passing various instances of the above ingredients

```


## Clarification / Correction

The included exercise solutions starting with exercise 2 include all constructors. The implication of the exercises is actually to start with no constructors and add them in starting with exercise 5.