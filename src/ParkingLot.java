import java.util.ArrayList;
import java.util.List;

public class ParkingLot  {
    private final int sizeOfSlots = 2;
    private final List<Slot> slots = new ArrayList<Slot>();

    public ParkingLot(){
        for(int i = 0 ;i<sizeOfSlots;i++){
            slots.add(new Slot());
        }
    }

    public boolean isSlotAvailable(){
        for(Slot slot : slots){
            if(slot.isPlaceAvailable())
                return true;
        }
        return false;
    }

    public Slot getSlot(){
        for(Slot slot : slots){
            if(slot.isPlaceAvailable())
                return slot;
        }
        return null;
    }

    public Slot getSpecificSlot(Car car) {
        for (Slot slot : slots) {
            if(slot.have(car)){
                return  slot;
            }
        }
        return null;
    }


}
