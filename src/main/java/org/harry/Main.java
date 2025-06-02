package org.harry;

import org.harry.creational_patterns.abstract_factory_pattern.AbstractFactoryPatternMain;
import org.harry.creational_patterns.builder_pattern.BuilderPatternMain;
import org.harry.creational_patterns.factory_method.FactoryMethodMain;

public class Main {
    public static void main(String[] args) {
        //Factory method pattern
        FactoryMethodMain.factoryMethodMain();

        //AbstractFactory Pattern
        AbstractFactoryPatternMain.implAFP();

        //builder pattern
        BuilderPatternMain.builderPatternMain();

    }
}