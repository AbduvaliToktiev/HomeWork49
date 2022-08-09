import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car(7500, "Audi R8", 2013);
        Car lexus = new Car(20000, "Lx 470", 2008);
        Car mercedes = new Car(23500, "E 500", 2015);
        HashMap<Integer, Car> carHashMap = new HashMap<>();
        carHashMap.put(1, audi);
        carHashMap.put(2, mercedes);
        carHashMap.put(3, lexus);
        for (Map.Entry<Integer, Car> entry : carHashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
