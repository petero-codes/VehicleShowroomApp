import java.util.Scanner;

public class Showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Car Details:");
        
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        
        System.out.print("Model: ");
        String model = scanner.nextLine();
        
        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()
        
        System.out.print("Fuel Type: ");
        String fuelType = scanner.nextLine();

        // Instantiate Car object
        Car myCar = new Car(brand, model, year, fuelType);

        // Display Details
        System.out.println("\n--- Vehicle Details ---");
        myCar.displayDetails();
        
        scanner.close();
    }
}
