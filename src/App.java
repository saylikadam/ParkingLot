import java.util.Scanner;

public class App {

    public void run(){
        Scanner sc = new Scanner(System.in);
        ParkingLots parkingLots = new ParkingLots();

        while(parkingLots.isParkingLotAvailable()){
            System.out.println("parking available,you can park your car");
            System.out.println("enter the car number");
            int carNo = sc.nextInt();
            Driver driver = new Driver(new Car(carNo));
            parkingLots.allow(driver);
            System.out.println("parking is done successfully!\n\n");
        }
        System.out.println("parking is not available");
    }

    public static void main(String[] args) {
        App app =new App();
        app.run();
    }
}