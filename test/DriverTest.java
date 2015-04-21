import org.junit.Test;

import static junit.framework.Assert.assertTrue;
public class DriverTest{
    @Test
    public void parkMethodShouldparkTheCarIntoParkingLot(){
        ParkingLots parkingLots = new ParkingLots();
        Driver driver = new Driver(parkingLots);
        Car car = new Car(10);
        driver.park(car);
        assertTrue(parkingLots.isCarParked(car));
    }
}
