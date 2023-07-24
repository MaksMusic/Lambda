package LambdaStudents;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jena",24,1));
        studentList.add(new Student("Kena",27,2));
        studentList.add(new Student("Uena",19,2));
        studentList.add(new Student("Eena",39,1));
        studentList.add(new Student("Dena",29,3));
        studentList.add(new Student("Aena",17,2));

        //это лямбда реализация методы check
        printStudents(studentList,(std)-> std.getAge()> 20);

        // лямбда выражение в котором есть проверка и вывод и return
        //выводит слово ученик и возвращает метод true если ученик с 1 группы
        printStudents(studentList,(std)-> {
            if (std.getGroup() == 1) {
                System.out.print("Ученик ");
            }
            return std.getGroup() == 1;
        });

    }

    public static void printStudents(List<Student> studentList,StudentCheck studentCheck){
//        studentList.forEach(student -> {
//            if (studentCheck.check(student)) {
//                System.out.println(student);
//            }
//        });
        //или
        for (Student student : studentList) {
            if (studentCheck.check(student)){
                System.out.println(student);
            }
        }

    }

}
