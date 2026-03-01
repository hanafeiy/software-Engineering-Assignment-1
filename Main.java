import java.util.Scanner;

public class Main {

    // Basic Operations
    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN;
        }
        return a / b;
    }

    // Advanced Operations
    static double power(double base, double exp) {
        return Math.pow(base, exp);
    }

    static double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Cannot find square root of negative number!");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    static double percentage(double a, double b) {
        return (a * b) / 100;
    }

    static double modulus(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("╔══════════════════════════════╗");
        System.out.println("║     Advanced Calculator      ║");
        System.out.println("╚══════════════════════════════╝");

        while (running) {

            System.out.println("\n--- Choose Operation ---");
            System.out.println("1. Addition       (+)");
            System.out.println("2. Subtraction    (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division       (/)");
            System.out.println("5. Power          (^)");
            System.out.println("6. Square Root    (√)");
            System.out.println("7. Percentage     (%)");
            System.out.println("8. Modulus        (mod)");
            System.out.println("0. Exit");
            System.out.print("\nEnter choice: ");

            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }

            double num1, num2, result;

            // Operations that need only one number
            if (choice == 6) {
                System.out.print("Enter number: ");
                num1 = sc.nextDouble();
                result = squareRoot(num1);
                if (!Double.isNaN(result))
                    System.out.println("√" + num1 + " = " + result);
                continue;
            }

            // Operations that need two numbers
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    if (!Double.isNaN(result))
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    break;
                case 5:
                    result = power(num1, num2);
                    System.out.println(num1 + " ^ " + num2 + " = " + result);
                    break;
                case 7:
                    result = percentage(num1, num2);
                    System.out.println(num2 + "% of " + num1 + " = " + result);
                    break;
                case 8:
                    result = modulus(num1, num2);
                    System.out.println(num1 + " mod " + num2 + " = " + result);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number from the menu.");
            }
        }

        sc.close();
    }
}
