public class Bike extends Vehicle {

    public Bike(String vehicleName) {
        super(vehicleName);
    }

    @Override
    public double fuelCost(double km) {
        return km * 3;
    }
}