public class Car extends Vehicle {

    public Car(String vehicleName) {
        super(vehicleName);
    }

    @Override
    public double fuelCost(double km) {
        return km * 8;
    }
}