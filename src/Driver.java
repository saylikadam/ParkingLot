public class Driver {
    private ParkingLots parkingLots ;

    public Driver(ParkingLots parkingLots) {
        this.parkingLots = parkingLots;
    }



    public boolean park(Car car) {
        Parkable parkingLot = parkingLots.getAvailableParkingLot();
        if(parkingLot!=null){
            Slot slot = parkingLot.getSlot();
            slot.addCar(car);
            return true;
        }
        return false;
    }
}
