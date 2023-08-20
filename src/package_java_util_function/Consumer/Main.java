package package_java_util_function.Consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Bmw","black",500);
        //������ �������� ������ ������ �������� ������� accept ������� ��������� ������ � ����������� ���
        changeCar(car,(car1 -> {
           car.color = "white";
           car.model = car.model + " turbo";
           car.engine = car.engine + 100;
        }));

        System.out.println(car);
    }


    //�������������� ������� ����� ��������� ��� ������� ������ ����� �������� ������ ��������� �� ��������������
    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
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
