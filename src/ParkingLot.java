import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingLot {

    int sizeOfSlots = 2;
    private final List<Slot> slots = new ArrayList<Slot>();

    public ParkingLot(){
        for(int i = 0 ;i<sizeOfSlots;i++){
            slots.add(new Slot());
        }
    }

    public boolean isPlaceAvailable(){
        for(int i = 0 ;i < sizeOfSlots; i++){
            if(slots.get(i).isPlaceAvailable())
                return true;
        }
        return false;
    }

    public int giveLengthOfSlots(){
        return slots.size();
    }

    public void parkCar(Car car){
        for(int i =0 ;i<sizeOfSlots;i++){
            if(slots.get(i).isPlaceAvailable()){
                slots.get(i).addCar(car);
                return;
            }
        }

    }
}
