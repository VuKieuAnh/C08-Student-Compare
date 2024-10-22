import java.util.Arrays;
import java.util.Comparator;

public class Client {
    public static void main(String[] args) {
        Student a = new Student("Tri", 22, 173, 68, 23);
        Student a1 = new Student("Dung", 23, 173, 110, 20);
        Student a2 = new Student("Thang", 21, 153, 68, 26);
        Student a3 = new Student("Loc", 19, 138, 68, 19);
        Student students[] = {a, a1, a2, a3};
//        cung cap tieu chi so sanh: mac dinh la sap xep theo point
        Arrays.sort(students);
//        for (Student student : students) {
//            System.out.println(student);
//        }

//        sap xep theo chieu cao:
//        thay doi lai code cua Student cho trien khai phuong thuc Compare....
//        -> khong nen lam? cung cap 1 tieu chi khac de so sanh
//        lop nac danh
        Comparator<Student> studentComparator = new Comparator<Student>() {
            public int compare(Student o1, Student o2){
                return o1.getWeight() - o2.getWeight();
            }
        };

        Arrays.sort(students, studentComparator);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
