/**
 * Created by saylik on 16/04/15.
 */
public class Driver {
    private Car car;
    private Parkable parkingLot;

    public Driver(Car car,ParkingLot parkingLot) {
        this.car = car;
        this.parkingLot = parkingLot;

    }

    public void parkCar(){
        Slot slot = parkingLot.giveSlot();
        slot.addCar(car);
    }
}
