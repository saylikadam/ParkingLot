
import java.util.ArrayList;
import java.util.List;

public class Slot {
    private final int noOfMaxCar = 2;
    private List<Car> cars;

    public Slot() {
        cars  = new ArrayList<Car>();
    }

    public void addCar(Car car){
        if(isPlaceAvailable()){
            cars.add(car);
        }
    }

    public boolean isPlaceAvailable(){
        return cars.size()<noOfMaxCar;
    }


    public boolean have(Car outerCar) {
        for (Car car : cars){
            if (car.equals(outerCar)) {
                return true;
            }
        }
        return false;
    }

    public void releaseCar(Car outerCar) {
        for (Car car : cars) {
            if(car.equals(outerCar)){
                cars.remove(car);
                return;
            }
        }
    }
}
