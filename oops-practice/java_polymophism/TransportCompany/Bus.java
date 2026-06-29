public class Bus extends Vehicle {

    public Bus(String vehicleName) {
        super(vehicleName);
    }

    @Override
    public double fuelCost(double km) {
        return km * 15;
    }
}