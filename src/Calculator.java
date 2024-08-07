import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void startCalculator() {
        double result = 0;
        int choice = displayCalculatorMenu();
        switch (choice){
            case 1:
                result = sum(getA(), getB());
                break;
            case 2:
                result = subtract(getA(), getB());
                break;
            case 3:
                result = multiply(getA(), getB());
                break;
            case 4:
                result = divide(getA(), getB());
                break;
            default:
                break;
        }
        System.out.printf("The result is: %.2f\n", result);
    }

    public static int displayCalculatorMenu(){
        System.out.println("Please choose an option");
        System.out.println("1.- Sum (a+b)\n2.- Subtract (a-b)\n3.- Multiply (a*b)\n4.- Divide (a/b)");
        return scanner.nextInt();
    }

    public static int getA(){
        System.out.println("Please enter value for a:");
        return scanner.nextInt();
    }
    public static int getB(){
        System.out.println("Please enter value for b:");
        return scanner.nextInt();
    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static double divide(int a, int b){
        return (double)a/b;
    }
}
