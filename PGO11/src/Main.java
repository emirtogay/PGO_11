import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", 2015));
        cars.add(new Car("BMW m4", 2018));
        cars.add(new Car("Ford Mustang", 2020));
        cars.add(new Car("mercedes", 2019));
        cars.add(new Car("BMW 320D", 2017));
        cars.add(new Car("Audi A4", 2016));
        cars.add(new Car("Ford Focus", 2021));
        cars.add(new Car("Volkswagen ", 2014));
        cars.add(new Car("Astra", 2013));
        cars.add(new Car("Nissan GTR", 2022));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
