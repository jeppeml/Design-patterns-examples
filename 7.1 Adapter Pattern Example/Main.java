package dk.easv;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ICar> myList = new ArrayList<>();
        myList.add(new Car("BB66724","VW","Beetle","03-74", 74_000d, CarType.small));

        IStrangeCar strangeCar = new StrangeCar("AC44564", "DK", LocalDateTime.now(), 455_000);
        ICar adaptedCar = new StrangeCarAdapter(strangeCar);
        myList.add(adaptedCar);

        for(ICar ic : myList){
            System.out.println(ic.getLicensePlate());
        }

        CarFactory cf = new CarFactory();
        ICar car = cf.create("car", CarType.small, "BB66724");


    }
}
