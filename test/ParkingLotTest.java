import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class ParkingLotTest {
    @Test
    public void isPlaceAvailableShouldReturnTrueWhenSlotIsAvailable(){
        ParkingLot parkingLot = new ParkingLot();
        assertTrue(parkingLot.isPlaceAvailable());
    }

    @Test
    public void giveLengthOfSlotsShouldGiveTheLengthOfSlots(){
        ParkingLot pl = new ParkingLot();
        assertEquals(pl.giveLengthOfSlots(),2);
    }



}
