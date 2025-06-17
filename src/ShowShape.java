import java.util.Scanner;

public class ShowShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        printRectangle(scanner);
                        break;
                    case 2:
                        printSquareTriangle(scanner);
                        break;
                    case 3:
                        printIsoscelesTriangle(scanner);
                        break;
                    case 0:
                        running = false;
                        System.out.println("Exiting program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
        }
    }

    private static void printRectangle(Scanner scanner) {
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        if (width <= 0 || height <= 0) {
            System.out.println("Width and height must be positive numbers.");
            return;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printSquareTriangle(Scanner scanner) {
        System.out.println("Choose corner position:");
        System.out.println("1. Top-left");
        System.out.println("2. Top-right");
        System.out.println("3. Bottom-left");
        System.out.println("4. Bottom-right");
        System.out.print("Enter your choice: ");
        int position = scanner.nextInt();
        System.out.print("Enter size (number of rows): ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Size must be a positive number.");
            return;
        }

        switch (position) {
            case 1:
                for (int i = size; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = size; i >= 1; i--) {
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Invalid position choice.");
        }
    }

    private static void printIsoscelesTriangle(Scanner scanner) {
        System.out.print("Enter height of isosceles triangle: ");
        int height = scanner.nextInt();

        if (height <= 0) {
            System.out.println("Height must be a positive number.");
            return;
        }

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}