import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do{
            int choice = displayMenu();
            switch (choice) {
                case 1:
                    Calculator.startCalculator();
                    break;
                case 2:
                    Encoder.startEncoder();
                    break;
                case 3:
                    Student.startStudent();
                    break;
                default:
                    System.out.println("Please pick a valid option");
                    break;
            }
        }while (true);
        }

    public static int displayMenu() {
        System.out.println("\n   ---Main Menu---");
        System.out.println("Please choose an option");
        System.out.println("1.- Basic calculator\n2.- Encoder\n3.- Student Average Calculator");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
}