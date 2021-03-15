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