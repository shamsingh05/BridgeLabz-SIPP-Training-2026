public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("Honda City"),
                new Bus("Volvo Bus"),
                new Bike("Yamaha R15"),
                new ElectricCar("Tesla Model 3")
        };

        FleetManager.calculateFuelCost(vehicles, 50);
    }
}