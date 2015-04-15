import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class ParkingLotTest {
    @Test
    public void isSlotAvailableShouldReturnTrueWhenSlotIsAvailable(){
        Slot slot = new Slot(new Car(12));
        List<Slot> slots = new ArrayList<Slot>(7);
        slots.add(slot);
        ParkingLot parkingLot = new ParkingLot(slots);
        assertTrue(parkingLot.isSlotAvailable());
    }

    @Test
    public void isSlotAvailableShouldReturnFalseWhenSlotIsNotAvailable(){
        List<Slot> slots = new ArrayList<Slot>();
        Slot slot1 = new Slot(new Car(12));
        Slot slot2 = new Slot(new Car(22));
        Slot slot3 = new Slot(new Car(33));
        Slot slot4 = new Slot(new Car(44));
        Slot slot5 = new Slot(new Car(55));
        Slot slot6 = new Slot(new Car(66));
        Slot slot7 = new Slot(new Car(77));
        Slot slot8 = new Slot(new Car(88));
        slots.add(slot1);
        slots.add(slot2);
        slots.add(slot3);
        slots.add(slot4);
        slots.add(slot5);
        slots.add(slot6);
        slots.add(slot7);
        slots.add(slot8);
        ParkingLot parkingLot = new ParkingLot(slots);
        assertFalse(parkingLot.isSlotAvailable());
    }

    @Test
    public void addCarShouldAddACarInList(){
        List<Slot> slots = new ArrayList<Slot>();
        ParkingLot pl = new ParkingLot(slots);
        pl.addCar(new Car(12));
        assertEquals(slots.size(), 1);
    }

}
