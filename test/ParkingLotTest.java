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
        ParkingLots parkingLots = new ParkingLots();
        Driver driver = new Driver(parkingLots);
        Parkable parkingLot = parkingLots.getAvailableParkingLot();
        driver.park(new Car(11));
        driver.park(new Car(12));
        driver.park(new Car(13));
        driver.park(new Car(14));
        driver.park(new Car(15));
        assertFalse(parkingLot.isSlotAvailable());
    }

}
