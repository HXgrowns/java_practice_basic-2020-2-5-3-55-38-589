import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Student student = new Student("李莉", 20, "女");
        System.out.println(student);
        student.study();
        student.relax();

        List<Student> students = new ArrayList<>();
        students.add(new Student("李莉", 20, "女"));
        students.add(new Student("王其", 21, "男"));

        Teacher teacher = new Teacher("张龙", students);
        teacher.addStudent(new Student("赵毅", 22, "男"));
        System.out.println(teacher.getStudents());
    }
}
