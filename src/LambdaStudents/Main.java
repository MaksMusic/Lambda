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

        //��� ������ ���������� ������ check
        printStudents(studentList,(std)-> std.getAge()> 20);

        // ������ ��������� � ������� ���� �������� � ����� � return
        //������� ����� ������ � ���������� ����� true ���� ������ � 1 ������
        printStudents(studentList,(std)-> {
            if (std.getGroup() == 1) {
                System.out.print("������ ");
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
        //���
        for (Student student : studentList) {
            if (studentCheck.check(student)){
                System.out.println(student);
            }
        }

    }

}
