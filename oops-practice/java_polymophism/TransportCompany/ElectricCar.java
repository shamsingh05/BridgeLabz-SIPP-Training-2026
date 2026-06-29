public class ElectricCar extends Vehicle {

    public ElectricCar(String vehicleName) {
        super(vehicleName);
    }

    @Override
    public double fuelCost(double km) {
        return km * 2;
    }
}