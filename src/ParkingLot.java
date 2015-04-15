import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    List<Slot> slots = new ArrayList<Slot>();
    private int slotNo = 7;

    public ParkingLot(List<Slot> slot) {
        this.slots = slot;
    }

    public boolean isSlotAvailable(){
        return slots.size()<= slotNo;
    }

    public void addCar(Car car){
        slots.add(new Slot(car));
    }
}
