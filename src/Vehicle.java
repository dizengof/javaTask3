abstract class Vehicle {
    abstract void move();
}

abstract class SeaFaringVehicle extends Vehicle {
    @Override
    void move() {
        System.out.println("It swims!");
    }
}

abstract class LandVehicle extends Vehicle {
    @Override
    void move() {
        System.out.println("It rides!");
    }
}

abstract class FlyingVehicle extends Vehicle {
    @Override
    void move() {
        System.out.println("It flies!");
    }
}
