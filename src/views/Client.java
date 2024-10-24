package views;

import controller.student.ManagerStudent;
import model.Student;

import java.util.*;

public class Client {
    public static void main(String[] args) {
//        cho phep quy dinh kieu du lieu nhu la tham so
//        cach su dung
//        tai su dung code cho nhung kieu du lieu khac nhau
//        List<String> strings = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());int p=0;
        for (Student student : students) {
            p+=student.getPoint();
        }

//        khong su dung Generic -> mac dinh la kieu Object
        List list = new ArrayList();
        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        list.add(new ManagerStudent(1, new Student()));
        list.add("fhajsgfhs");
        int p1 = 0;
        for (Object student : list) {
            if (student instanceof Student) {
                p+=((Student)student).getPoint();
            }
        }
//        code ban
//        dinh keu ko ro rang



    }
}
