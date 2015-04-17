import org.junit.Test;

import static junit.framework.Assert.assertEquals;
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
        Driver driver1 = new Driver(11,parkingLot);
        Driver driver2 = new Driver(12,parkingLot);
        Driver driver3 = new Driver(13,parkingLot);
        Driver driver4 = new Driver(14,parkingLot);
        driver1.parkCar();
        driver2.parkCar();
        driver3.parkCar();
        driver4.parkCar();
        assertFalse(parkingLot.isSlotAvailable());
    }
    @Test
    public void isSlotAvailableShouldReturnTrueWhenThereIsSlotAvailableInParkingLot(){
        ParkingLot parkingLot = new ParkingLot();
        Driver driver1 = new Driver(11,parkingLot);
        Driver driver2 = new Driver(12,parkingLot);
        driver1.parkCar();
        driver2.parkCar();
        assertTrue(parkingLot.isSlotAvailable());
    }

}
