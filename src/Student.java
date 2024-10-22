public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int height;
    private int weight;
    private int point;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", point=" + point +
                '}';
    }

    public Student(String name, int age, int height, int weight, int point) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.point = point;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public int compareTo(Student o) {
//        so am -> nho hon, so duong -> lon hon, bang =0
//        if (this.point > o.point) {
//            return 1;
//        }
//        else if (this.point < o.point) {
//            return -1;
//        }
//        return 0;
        return point - o.point;
    }

    //    public static void main(String[] args) {
//        System.out.println("C08");
//    }
}
