import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertTrue;


public class AppTest{
    @Test
    public void OneDriverIsReleasingAndNotifyingOtherDriverToParkTheCar(){
        Car releaseCar = new Car(12);
        Car parkCar = new Car(15);
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(11));
        cars.add(new Car(12));
        cars.add(new Car(13));
        cars.add(new Car(14));
        ParkingLot parkingLot = new ParkingLot();
        Driver driver = new Driver();
        App app = new App();
        app.parkFourPark(driver,parkingLot,cars);
        app.releaseAndPark(driver,parkingLot,releaseCar,parkCar);
        Slot slot = parkingLot.getSpecificSlot(parkCar);
        assertTrue(slot.have(parkCar));
    }
}
