import model.Student;

public class Print {
    public static void main(String[] args) {
        Student student = new Student("Linda",22,"female","190106");
        student.setName("John");
        student.setAge(18);
        student.setGender("male");
        student.setId("190318");

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getId());
    }
}
