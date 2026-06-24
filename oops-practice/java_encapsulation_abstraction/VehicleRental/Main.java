public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.setVehicleNumber("CAR101");
        car.setVehicleType("Car");
        car.setDailyRate(1000);

        Bike bike = new Bike();

        bike.setVehicleNumber("BIKE101");
        bike.setVehicleType("Bike");
        bike.setDailyRate(500);

        Truck truck = new Truck();

        truck.setVehicleNumber("TRUCK101");
        truck.setVehicleType("Truck");
        truck.setDailyRate(2000);
        truck.setLoadingCharge(3000);

        car.displayVehicleInfo();
        System.out.println(
                "Cost : " +
                car.calculateRentalCost(5));

        System.out.println();

        bike.displayVehicleInfo();
        System.out.println(
                "Cost : " +
                bike.calculateRentalCost(5));

        System.out.println();

        truck.displayVehicleInfo();
        System.out.println(
                "Cost : " +
                truck.calculateRentalCost(5));
    }
}