import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    List<Slot> slots = new ArrayList<Slot>();

    public ParkingLot(List<Slot> slot) {
        this.slots = slot;
    }

    public boolean isSlotAvailable(){
        return slots.size()<7;
    }

    public void addCar(Car car){
        slots.add(new Slot(car));
    }
}
