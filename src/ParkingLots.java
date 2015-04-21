import java.util.ArrayList;
import java.util.List;

public class ParkingLots {
    private final int sizeOfParkingLots = 2;
    List<ParkingLot> parkingLots = new ArrayList<ParkingLot>();

    public ParkingLots() {
        for(int i = 0 ; i< sizeOfParkingLots; i++){
            parkingLots.add(new ParkingLot());
        }
    }

    public boolean isCarParked(Car car){
        for(ParkingLot parkingLot : parkingLots){
            if(parkingLot.isCarParked(car)){
                return  true;
            }
        }
        return false;
    }

    public boolean isParkingLotAvailable(){
        for(ParkingLot parkingLot : parkingLots){
            if(parkingLot.isSlotAvailable()){
                return  true;
            }
        }
        return false;
    }

    public Parkable getAvailableParkingLot() {
        for(ParkingLot parkingLot : parkingLots){
            if(parkingLot.isSlotAvailable()){
                return  parkingLot;
            }
        }
        return null;
    }
}
