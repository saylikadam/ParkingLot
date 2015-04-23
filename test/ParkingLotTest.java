import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class ParkingLotTest {
    @Test
    public void isSlotAvailableShouldReturnTrueWhenSlotIsAvailable(){
        ParkingLot parkingLot = new ParkingLot();
        assertTrue(parkingLot.isSlotAvailable());
    }
    @Test
    public void isSlotAvailableShouldReturnFalseWhenThereIsNoSlotAvailableInParkingLot(){
        ParkingLot parkingLot = new ParkingLot();
        Driver driver = new Driver();
        driver.parkCar(parkingLot,new Car(10));
        driver.parkCar(parkingLot,new Car(10));
        driver.parkCar(parkingLot,new Car(10));
        driver.parkCar(parkingLot,new Car(10));
        assertFalse(parkingLot.isSlotAvailable());
    }
    @Test
    public void isSlotAvailableShouldReturnTrueWhenThereIsSlotAvailableInParkingLot(){
        ParkingLot parkingLot = new ParkingLot();
        Driver driver = new Driver();
        driver.parkCar(parkingLot,new Car(10));
        driver.parkCar(parkingLot,new Car(10));
        assertTrue(parkingLot.isSlotAvailable());
    }

}
