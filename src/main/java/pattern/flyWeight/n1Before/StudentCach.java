package pattern.flyWeight.n1Before;

import java.util.WeakHashMap;

public class StudentCach {
    private static final WeakHashMap<String, Student> students = new WeakHashMap<>();

    public Student getStudent(String name) {
        Student student = students.get(name);
        if (student == null) {
            student = new Student(name);
            students.put(name, student);
        }
        return student;
    }
}
