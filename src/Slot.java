import java.util.ArrayList;
import java.util.List;

public class Slot {
    private final int noOfMaxCar = 2;
    private List<Car> cars ;

    public Slot() {
        cars  = new ArrayList<Car>();
    }

    public void addCar(Car car){
        if(isPlaceAvailable()){
            cars.add(car);
        }
    }

    public boolean isParked(Car newCar){
        for (Car car : cars) {
            if(car.equals(newCar))
                return true;
        }
        return false;
    }
    public boolean isPlaceAvailable(){
        return cars.size()<noOfMaxCar;
    }

}
