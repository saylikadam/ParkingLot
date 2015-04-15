import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run(){
        Scanner sc = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot();

        while(parkingLot.isPlaceAvailable()){
            System.out.println("parking available,you can park your car");
            System.out.println("enter the car number");
            int carNo = sc.nextInt();
            Car car = new Car(carNo);
            parkingLot.parkCar(car);
            System.out.println("parking is done successfully!\n\n");
        }
        System.out.println("parking is not available");
    }

    public static void main(String[] args) {
        App app =new App();
        app.run();
    }
}