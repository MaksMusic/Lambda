package package_java_util_function.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //создание листа
        Human human1 = new Human("Tom", 22, 100_000);
        Human human2 = new Human("Tom", 27, 200_000);
        Human human3 = new Human("Tom", 24, 40_000);
        Human human4 = new Human("Tom", 21, 200_000);
        Human human5 = new Human("Tom", 32, 500_000);
        List<Human> humanList = new ArrayList<Human>();
        humanList.add(human1);
        humanList.add(human2);
        humanList.add(human3);
        humanList.add(human4);
        humanList.add(human5);

        //запуск метода в который передает лист и Predicate (содержимое функции test)
        testHuman(humanList,(human)-> human.getAge() > 25);
        System.out.println();
        testHuman(humanList,(human)-> human.getSalary() > 100_000);
        System.out.println();
        testHuman(humanList,(human)-> human.getAge() > 30);
        System.out.println();

        //объединение двух проверок
        Predicate<Human> predicate = human -> human.getAge() > 25;
        Predicate<Human> predicate2 = human -> human.getSalary() > 50_000;
        testHuman(humanList,predicate.and(predicate2));
        System.out.println();

        //если проходит хотя бы по одной из проверок
        Predicate<Human> predicate3 = human -> human.getAge() > 25;
        Predicate<Human> predicate5 = human -> human.getSalary() > 50_000;
        testHuman(humanList,predicate3.or(predicate5));
        System.out.println();

        //противоположное значение проверки если вернут true значит false
        //то-есть если возраст меньше 25
        Predicate<Human> predicate7 = human -> human.getAge() > 25;
        testHuman(humanList,predicate3.negate());
    }

    //метод test у интерфейса Predicate возвращает true или false
    public static void testHuman(List<Human> humansList, Predicate<Human> predicate) {
        for (Human human : humansList) {
            if (predicate.test(human)) {
                System.out.println(human);
            }
        }
    }
}
