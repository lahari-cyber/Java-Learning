// Parent Class
class Appliance {

    // Parent Method
    void turnOn() {
        System.out.println("Turning on the appliance...");
    }
}

// Child Class 1
class Fan extends Appliance {

    // Overriding Parent Method
    @Override
    void turnOn() {
        System.out.println("Fan starts rotating.");
    }
}

// Child Class 2
class Light extends Appliance {

    // Overriding Parent Method
    @Override
    void turnOn() {
        System.out.println("Light starts glowing.");
    }
}

// Child Class 3
class AirConditioner extends Appliance {

    // Overriding Parent Method
    @Override
    void turnOn() {
        System.out.println("Air Conditioner starts cooling.");
    }
}

public class methodoverriding {

    public static void main(String[] args) {

        // Parent reference holding Fan object
        Appliance device = new Fan();
        device.turnOn();

        // Parent reference holding Light object
        device = new Light();
        device.turnOn();

        // Parent reference holding AirConditioner object
        device = new AirConditioner();
        device.turnOn();
    }
}
/* 
Parent Class:
Appliance

Child Classes:
Fan
Light
AirConditioner

Parent Method:
turnOn()

Overridden Method:
turnOn() in every child class.

Object:
Appliance device = new Fan();
Appliance device = new Light();
Appliance device = new AirConditioner();

Polymorphism Used:
Method Overriding (Runtime Polymorphism)

Where does polymorphism happen?
When we write:

device.turnOn();

The reference variable is of type Appliance,
but the object can be Fan, Light, or AirConditioner.

Java checks the actual object at runtime
and calls the corresponding turnOn() method.

This is Runtime Polymorphism. */