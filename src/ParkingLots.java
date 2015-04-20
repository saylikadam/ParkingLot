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

    public void allow(Driver driver){
        for(ParkingLot parkingLot : parkingLots){
            if(parkingLot.isSlotAvailable()){
                parkingLot.allow(driver);
                return;
            }
        }
    }

    public boolean isParkingLotAvailable(){
        for(ParkingLot parkingLot : parkingLots){
            if(parkingLot.isSlotAvailable()){
                return  true;
            }
        }
        return false;
    }

}
