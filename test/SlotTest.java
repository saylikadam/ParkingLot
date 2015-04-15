import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by saylik on 15/04/15.
 */
public class SlotTest {
    @Test
    public void isPlaceAvailableShouldReturnTrueWhenThePlaceIsAvailableInTheSlot(){
        Slot slot = new Slot();
        assertTrue(slot.isPlaceAvailable());
    }

    @Test
    public void isPlaceAvailableShouldReturnFalseWhenThePlaceIsNotAvailableInTheSlot(){
        Slot slot = new Slot();
        slot.addCar(new Car(12));
        slot.addCar(new Car(12));
        slot.addCar(new Car(12));
        slot.addCar(new Car(12));
        slot.addCar(new Car(12));
        assertFalse(slot.isPlaceAvailable());
    }



}
