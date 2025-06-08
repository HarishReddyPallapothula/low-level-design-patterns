package org.harry;

import org.harry.creational_patterns.abstract_factory_pattern.AbstractFactoryPatternMain;
import org.harry.creational_patterns.builder_pattern.BuilderPatternMain;
import org.harry.creational_patterns.factory_method.FactoryMethodMain;
import org.harry.creational_patterns.prototype_pattern.PrototypePatternMain;
import org.harry.creational_patterns.singleton_pattern.SingletonPatternMain;

/*The problem it solves.
Say you have an object, and you want to create an exact copy of it. How would you do it?
First, you have to create a new object of the same class.
Then you have to go through all the fields of the original object and copy their values over to the new object.

Nice! But there’s a catch. Not all objects can be copied that way because some of the object’s fields may be private and not visible from outside of the object itself.

There’s one more problem with the direct approach.
Since you have to know the object’s class to create a duplicate, your code becomes dependent on that class.
If the extra dependency doesn’t scare you, there’s another catch.
Sometimes you only know the interface that the object follows, but not its concrete class, when, for example, a parameter in a method accepts any objects that follow some interface.*/


/*
Imagine you have an object that:
Is expensive to create (e.g., loading config, connecting to external systems)
Requires a lot of initialization
Needs to be customized slightly per use
Creating such an object over and over from scratch is inefficient. Instead, you can:
    Create a base "prototype" object.
    Clone it and modify the necessary fields.*/


public class Main {
    public static void main(String[] args) {
        //Factory method pattern
        FactoryMethodMain.factoryMethodMain();

        //AbstractFactory Pattern
        AbstractFactoryPatternMain.implAFP();

        //builder pattern
        BuilderPatternMain.builderPatternMain();

        //prototype pattern
        PrototypePatternMain.prototypePatternMain();

        //Singleton Pattern
        SingletonPatternMain.singletonPatternMain();
    }
}