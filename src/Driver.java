public class Driver {

    public void parkCar(ParkingLot parkingLot,Car car) {
        if(parkingLot.isSlotAvailable()){
            Slot slot = parkingLot.getSlot();
            slot.addCar(car);
            //System.out.println("parking done successfully");
        }
        else
            System.out.println("parking is not available");
    }

    public void releaseCar(ParkingLot parkingLot,Car car1,Car car2){
        Slot slot = parkingLot.getSpecificSlot(car1);
        if(slot!=null){
            slot.releaseCar(car1,car2,parkingLot);
            //System.out.println("car is removed");
        }
        else
            System.out.println("there is no car of this number in parking lot");
    }
}
