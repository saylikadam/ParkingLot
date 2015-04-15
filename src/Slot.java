import java.util.ArrayList;
import java.util.List;

public class Slot {
    int noOfMaxCar = 2;
    private List<Car> cars ;

    public Slot() {
        cars  = new ArrayList<Car>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public boolean isPlaceAvailable(){
        return cars.size()<noOfMaxCar;
    }



}
