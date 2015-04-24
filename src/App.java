import java.util.List;

public class App {

//    private Car getCar(){
//        System.out.println("enter the car number");
//        Scanner sc = new Scanner(System.in);
//        int carNo = sc.nextInt();
//        return new Car(carNo);
//    }
//    private void displayMenu(){
//        System.out.println("Enter 1 to park a car");
//        System.out.println("Enter 2 to release a car");
//    }
//
//    private int getOption(){
//        Scanner sc = new Scanner(System.in);
//        return sc.nextInt();
//    }

    public void releaseAndPark(Driver driver, ParkingLot parkingLot, Car car1, Car car2){
        driver.releaseCar(parkingLot, car1,car2);
    }

    public void parkFourPark(Driver driver,ParkingLot parkingLot,List<Car> cars){
        for (Car car : cars) {
            driver.parkCar(parkingLot,car);
        }
    }
//        while(true){
//            displayMenu();
//        int option = getOption();
//            if(option == 1)
//
//            driver1.parkCar(parkingLot, getCar());//notifying a driver to park or release a car
//            else if(option == 2)
//            }
//    }
//
//    public static void main(String[] args) {
//        App app =new App();
//        ParkingLot parkingLot = new ParkingLot();
//        Driver driver = new Driver();
//        app.releaseAndPark(parkingLot);
//    }
}