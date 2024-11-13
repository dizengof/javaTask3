abstract class Vehicle {
    abstract void move();
    abstract void stop();
}

abstract class SeaFaringVehicle extends Vehicle {
    @Override
    void move() {
        System.out.println("It swims!");
    }

    @Override
    void stop() {
        System.out.println("It stopped swimming.");
    }
}

abstract class LandVehicle extends Vehicle {
    @Override
    void move() {
        System.out.println("It rides!");
    }

    @Override
    void stop() {
        System.out.println("It stopped riding.");
    }
}

abstract class FlyingVehicle extends Vehicle {
    @Override
    void move() {
        System.out.println("It flies!");
    }

    @Override
    void stop() {
        System.out.println("It stopped flying.");
    }
}
