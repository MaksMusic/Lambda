package package_java_util_function.Supplier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = getList( ()-> new Car("Bmw","black",205.0));
        carArrayList.forEach( e -> System.out.println(e));
    }


    //создать метод который принимает интерфейс  в котором есть 1 метод (указывающий на то что нужно вернуть объект)
    //метод вернут Лист из этих объектов
    public static ArrayList<Car> getList(Supplier<Car> carSupplier) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            carArrayList.add(carSupplier.get());
        }
        return carArrayList;
    }
}


class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", color='" + color + '\'' +
                ", enginel=" + engine +
                '}';
    }
}
