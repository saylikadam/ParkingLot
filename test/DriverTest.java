import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
public class DriverTest{
    @Test
    public void isSlotAvailableShouldReturnFalseWhenFourCarsAreParkedIntoSlot(){
        Driver driver1 = new Driver(new Car(10));
        Driver driver2 = new Driver(new Car(10));
        Driver driver3 = new Driver(new Car(10));
        Driver driver4 = new Driver(new Car(10));
        Parkable parkingLot = new ParkingLot();
        driver1.parkCar(parkingLot);
        driver2.parkCar(parkingLot);
        driver3.parkCar(parkingLot);
        driver4.parkCar(parkingLot);
        assertFalse(parkingLot.isSlotAvailable());
    }

    @Test
    public void isSlotAvailableShouldReturnTrueWhenThreeCarsAreParkedIntoSlot(){
        Driver driver1 = new Driver(new Car(10));
        Driver driver2 = new Driver(new Car(10));
        Driver driver3 = new Driver(new Car(10));
        Parkable parkingLot = new ParkingLot();
        driver1.parkCar(parkingLot);
        driver2.parkCar(parkingLot);
        driver3.parkCar(parkingLot);
        assertTrue(parkingLot.isSlotAvailable());
    }


}
