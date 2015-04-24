import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


public class SlotTest {
    @Test
    public void isPlaceAvailableShouldReturnTrueWhenThePlaceIsAvailableInTheSlot(){
        Slot slot = new Slot();
        assertTrue(slot.isPlaceAvailable());
    }

    @Test
    public void isPlaceAvailableShouldReturnFalseWhenThePlaceIsNotAvailableInTheSingleSlot(){
        Slot slot = new Slot();
        slot.addCar(new Car(12));
        slot.addCar(new Car(12));
        assertFalse(slot.isPlaceAvailable());
    }

    @Test
    public void isPlaceAvailableShouldReturnTrueWhenThePlaceIsAvailableInTheSingleSlot(){
        Slot slot = new Slot();
        slot.addCar(new Car(11));
        assertTrue(slot.isPlaceAvailable());
    }

}
