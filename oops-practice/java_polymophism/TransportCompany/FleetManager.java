public class FleetManager {

    public static void calculateFuelCost(Vehicle[] vehicles, double km) {

        for (Vehicle vehicle : vehicles) {

            System.out.println("--------------------------");

            System.out.println("Vehicle : " + vehicle.getVehicleName());

            if (vehicle instanceof Car) {
                System.out.println("Type : Car");
            } else if (vehicle instanceof Bus) {
                System.out.println("Type : Bus");
            } else if (vehicle instanceof Bike) {
                System.out.println("Type : Bike");
            } else if (vehicle instanceof ElectricCar) {
                System.out.println("Type : Electric Car");
            }

            System.out.println("Distance : " + km + " km");

            System.out.println("Fuel Cost : ₹" + vehicle.fuelCost(km));
        }
    }
}