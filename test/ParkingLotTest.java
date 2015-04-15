import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class ParkingLotTest {
    @Test
    public void isSlotAvailableShouldReturnTrueWhenSlotIsAvailable(){
        ParkingLot parkingLot = new ParkingLot();
        assertTrue(parkingLot.isPlaceAvailable());
    }

    @Test
    public void isSlotAvailableShouldReturnFalseWhenSlotIsNotAvailable(){
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.parkCar(new Car(12));
        parkingLot.parkCar(new Car(12));
        parkingLot.parkCar(new Car(12));
        parkingLot.parkCar(new Car(12));
        assertFalse(parkingLot.isPlaceAvailable());
    }

    @Test
    public void giveLengthOfSlotsShouldGiveTheLengthOfSlots(){
        ParkingLot pl = new ParkingLot();
        assertEquals(pl.giveLengthOfSlots(),2);
    }



}
