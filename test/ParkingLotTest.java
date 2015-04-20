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
        Driver driver1 = new Driver(new Car(10));
        Driver driver2 = new Driver(new Car(10));
        Driver driver3 = new Driver(new Car(10));
        Driver driver4 = new Driver(new Car(10));
        parkingLot.allow(driver1);
        parkingLot.allow(driver2);
        parkingLot.allow(driver3);
        parkingLot.allow(driver4);
        assertFalse(parkingLot.isSlotAvailable());
    }
    @Test
    public void isSlotAvailableShouldReturnTrueWhenThereIsSlotAvailableInParkingLot(){
        ParkingLot parkingLot = new ParkingLot();
        Driver driver1 = new Driver(new Car(10));
        Driver driver2 = new Driver(new Car(10));
        parkingLot.allow(driver1);
        parkingLot.allow(driver2);
        assertTrue(parkingLot.isSlotAvailable());
    }

    @Test
    public void getSlotWillReturnTheSlotIfItIsEmpty(){
        ParkingLot parkingLot = new ParkingLot();
        Driver driver1 = new Driver(new Car(10));
        Driver driver2 = new Driver(new Car(10));
        Driver driver3 = new Driver(new Car(10));
        Driver driver4 = new Driver(new Car(10));
        parkingLot.allow(driver1);
        parkingLot.allow(driver2);
        parkingLot.allow(driver3);
        parkingLot.allow(driver4);
        assertEquals(parkingLot.getSlot(),null);
    }

}
