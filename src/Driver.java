/**
 * Created by saylik on 16/04/15.
 */
public class Driver {
    private Parkable parkingLot;
    private  Car car;

    public Driver(int carNo , ParkingLot parkingLot) {
        this.car = new Car(carNo);
        this.parkingLot = parkingLot;

    }

    public void parkCar(){
        Slot slot = parkingLot.giveSlot();
        slot.addCar(car);
    }
}
