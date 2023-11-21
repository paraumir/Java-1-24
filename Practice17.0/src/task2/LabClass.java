package task2;
import java.util.Arrays;
public class LabClass {
    private Student[] students;

    public LabClass(Student[] students) {
        this.students = students;
    }

    public void sort() {
        Arrays.sort(students, (s1, s2) -> s1.getFullName().compareToIgnoreCase(s2.getFullName()));
    }

    public Student findStudentByFullName(String fullName) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with full name '" + fullName + "' not found.");
    }
}
