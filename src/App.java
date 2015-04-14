import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run(){
        Scanner sc = new Scanner(System.in);
        List<Slot> slots = new ArrayList<Slot>(7);
        ParkingLot parkingLot = new ParkingLot(slots);
        while(true){
            if(parkingLot.isSlotAvailable()){
                System.out.println("parking available,you can park your car");
                System.out.println("enter the car number");
            }
            else{
                System.out.println("parking is not available");
                System.exit(1);
            }
            int carNo = sc.nextInt();
            Car car = new Car(carNo);
            parkingLot.addCar(car);
        }
    }

    public static void main(String[] args) {
        App app =new App();
        app.run();
    }
}