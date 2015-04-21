import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class ParkingLotsTest  {

    @Test
    public void isParkingLotAvailableShouldReturnTrueWhenParkingLotIsAvailable(){
        ParkingLots pl = new ParkingLots();
        Driver driver = new Driver(pl);
        driver.park(new Car(10));
        assertTrue(pl.isParkingLotAvailable());
    }
    @Test
    public void isParkingLotAvailableShouldReturnFalseWhenParkingLotIsNotAvailable(){
        ParkingLots pl = new ParkingLots();
        Driver driver = new Driver(pl);
        driver.park(new Car(10));
        driver.park(new Car(11));
        driver.park(new Car(12));
        driver.park(new Car(13));
        driver.park(new Car(14));
        driver.park(new Car(15));
        driver.park(new Car(16));
        driver.park(new Car(17));
        assertFalse(pl.isParkingLotAvailable());
    }

    @Test
    public void getAvailableParkingLotShouldReturnNullWhenItIsEmpty(){
        ParkingLots pl = new ParkingLots();
        Driver driver = new Driver(pl);
        driver.park(new Car(11));
        driver.park(new Car(12));
        driver.park(new Car(13));
        driver.park(new Car(14));
        driver.park(new Car(15));
        driver.park(new Car(16));
        driver.park(new Car(17));
        driver.park(new Car(18));
        driver.park(new Car(19));
        driver.park(new Car(20));
        assertEquals(pl.getAvailableParkingLot(),null);


    }

}
