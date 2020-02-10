package model;

import java.util.List;

public class Teacher {
    private String name;
    private List<Student> students;

    public Teacher(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
