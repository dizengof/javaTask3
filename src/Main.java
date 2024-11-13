import java.util.Scanner;

public class Main {

    enum VehicleNames {AIRPLANE, BICYCLE, BOAT, CAR, HELICOPTER, SHIP}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle userVehicle;
        int key = 0;
        char c = '0';

        while(true) {
            System.out.println("-------------------------------------------");
            System.out.println("What kind of vehicle do you want to create?");
            System.out.println("1. Airplane\n2. Bicycle\n3. Boat\n4. Car\n5. Helicopter\n6.Ship");
            while (key < 1 || key > 6) key = sc.nextInt();
            userVehicle = create(key);
            key = 0;

            System.out.println("What do you want your vehicle to do?");
            System.out.println("1. Move\n2. Stop\n");
            while (key < 1 || key > 2) key = sc.nextInt();
            switch (key) {
                case 1:
                    userVehicle.move();
                    break;
                case 2:
                    userVehicle.stop();
                    break;
            }
            key = 0;

            System.out.println("Show vehicle info? (y/n)");
            while (c != 'y' || c != 'n') c = sc.next().charAt(0);
            if (c == 'y') userVehicle.showInfo();
            c = '0';

            System.out.println("Do you want to create another vehicle? (y/n)");
            if (sc.next().charAt(0) == 'n') break;
        }
    }

    public static Vehicle create(int key) {
        Vehicle tmp;
        switch(VehicleNames.values()[key - 1]) {
            case AIRPLANE:
                tmp = new Airplane();
                break;
            case BICYCLE:
                tmp = new Bicycle();
                break;
            case BOAT:
                tmp = new Boat();
                break;
            case CAR:
                tmp = new Car();
                break;
            case HELICOPTER:
                tmp = new Helicopter();
                break;
            case SHIP:
                tmp = new Ship();
                break;
        }
        System.out.println("Vehicle successfully created!");
        return tmp;
    }
}
