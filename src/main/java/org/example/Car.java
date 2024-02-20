package org.example;

public class Car {
    Engine engine;

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void go() {
        System.out.println("Car name is " + this.name);
        this.engine.run();
    }
}
