import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    public void run(){
        Scanner sc = new Scanner(System.in);
        ParkingLots parkingLots = new ParkingLots();
        Queue<Driver> drivers = getDrivers(parkingLots);

        while(parkingLots.isParkingLotAvailable()){
            System.out.println("parking available,you can park your car");
            System.out.println("enter the car number");
            int carNo = sc.nextInt();
            Car car = new Car(carNo);
            notifyDrivers(drivers, car);
            System.out.println("parking is done successfully!\n\n");
        }
        System.out.println("parking is not available");
    }

    private Queue<Driver> getDrivers(ParkingLots parkingLots) {
        Queue<Driver> drivers = new LinkedList<Driver>();
        drivers.add(new Driver(parkingLots));
        drivers.add(new Driver(parkingLots));
        return drivers;
    }

    private void notifyDrivers(Queue<Driver> drivers, Car car) {
        while(!drivers.isEmpty()){
            Driver driver = drivers.poll();
            if(driver.park(car))
                drivers.add(driver);
            break;
        }
    }

    public static void main(String[] args) {
        App app =new App();
        app.run();
    }
}