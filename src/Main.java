import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---MENU---");
            System.out.println("Which vehicle do you want to create?");
            System.out.println("1. Flying vehicle\n 2. Land vehicle\n 3. Sea-faring vehicle");
            switch(sc.nextInt()) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                default:
                    break;
            }
        }
    }
}
