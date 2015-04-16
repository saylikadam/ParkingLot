import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ParkingLot {

    private final int sizeOfSlots = 2;
    private final List<Slot> slots = new ArrayList<Slot>();

    public ParkingLot(){
        for(int i = 0 ;i<sizeOfSlots;i++){
            slots.add(new Slot());
        }
    }

    public boolean isPlaceAvailable(){
        for(Slot slot : slots){
            if(slot.isPlaceAvailable())
                return true;
        }
        return false;
    }

    public int giveLengthOfSlots(){
        return slots.size();
    }

    public void parkCar(Car car){
        for(Slot slot :slots){
            if(slot.isPlaceAvailable()){
                slot.addCar(car);
                return;
            }
        }
    }
}
