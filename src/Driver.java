public class Driver {
    private  Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public void parkCar(Parkable parkingLot) {
        if(parkingLot.isSlotAvailable()){
            Slot slot = parkingLot.getSlot();
            slot.addCar(car);
        }
    }
}
