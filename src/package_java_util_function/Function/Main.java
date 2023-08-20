package package_java_util_function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Tom", 22, 100_000);
        Human human2 = new Human("Tom", 27, 200_000);
        Human human3 = new Human("Tom", 24, 40_000);
        Human human4 = new Human("Tom", 21, 200_000);
        Human human5 = new Human("Tom", 32, 500_000);

        List<Human> humanList = new ArrayList<>();

        humanList.add(human1);
        humanList.add(human2);
        humanList.add(human3);
        humanList.add(human4);
        humanList.add(human5);


        //передает лист и значение по которому будет находиться среднее арифметическое
        double avgAge = avgOfSmth(humanList, human -> (double) human.getAge());
        double avgSalary = avgOfSmth(humanList, human -> human.getSalary());

        System.out.println(avgAge);
        System.out.println(avgSalary);

    }

    //метод находит среднее арифметическое
    //принимает лист и интерфейс у которого 1 метод принимающий 2 параметра и возвращающий второй
    private static double avgOfSmth(List<Human> list, Function<Human,Double> f){
        double avg = 0;
        for (Human human : list) {
            avg += f.apply(human);
        }
        return avg / list.size();

    }


}

class Human {
    private String name;
    private int age;
    private double salary;

    public Human(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
