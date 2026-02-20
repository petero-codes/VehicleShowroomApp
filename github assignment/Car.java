public class Car extends Vehicle {
    private String fuelType;

    // Constructor to initialize all fields
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Initialize fields from Vehicle
        this.fuelType = fuelType;
    }

    // Overriding displayDetails to include fuelType
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the base class method
        System.out.println("Fuel Type: " + fuelType);
    }
}
