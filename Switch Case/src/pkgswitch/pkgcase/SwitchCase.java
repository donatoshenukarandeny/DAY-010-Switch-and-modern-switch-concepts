package pkgswitch.pkgcase;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int addUser = 1;
        int viewUser = 2;
        int exit = 3;
        while (true) {
            System.out.println("Choose your option :");
            System.out.println("Press 1 for Add User");
            System.out.println("Press 2 for View User");
            System.out.println("Press 3 for Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1 ->
                    System.out.println("Add User");
                case 2 ->
                    System.out.println("View User");
                case 3 -> {
                    System.out.println("Exit");
                    //break;
                    System.exit(0);
                }
                default ->
                    System.out.println("Invalid Choice");
            }
        }
    }

}
