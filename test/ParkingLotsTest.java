import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class ParkingLotsTest  {

    @Test
    public void isParkingLotAvailableShouldReturnTrueWhenParkingLotIsAvailable(){
        ParkingLots pl = new ParkingLots();
        pl.allow(new Driver(new Car(10)));
        pl.allow(new Driver(new Car(10)));
        pl.allow(new Driver(new Car(10)));
        pl.allow(new Driver(new Car(10)));
        assertTrue(pl.isParkingLotAvailable());
    }

    @Test
    public void isParkingLotAvailableShouldReturnFalseWhenParkingLotIsNotAvailable(){
        ParkingLots pl = new ParkingLots();
        pl.allow(new Driver(new Car(10)));
        pl.allow(new Driver(new Car(10)));
        pl.allow(new Driver(new Car(10)));
        pl.allow(new Driver(new Car(10)));
        pl.allow(new Driver(new Car(10)));
        pl.allow(new Driver(new Car(10)));
        pl.allow(new Driver(new Car(10)));
        pl.allow(new Driver(new Car(10)));
        assertFalse(pl.isParkingLotAvailable());
    }

}
