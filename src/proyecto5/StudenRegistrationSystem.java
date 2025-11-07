package proyecto5;

import java.util.HashSet;

public class StudenRegistrationSystem {

    HashSet<Student> students;

    public StudenRegistrationSystem() {
        this.students = new HashSet<>();
    }

    public void AddStudent(Student student) throws proyecto5.excepciones.DuplicateStudentException {
        if (!students.add(student)) {
            throw new proyecto5.excepciones.DuplicateStudentException("Estudiante con ID " + student.getId() + " ya existe.");
        }
    }
    public Student findStudentById(String id) throws proyecto5.excepciones.StudentNotFoundException {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        throw new proyecto5.excepciones.StudentNotFoundException("Estudiante con ID " + id + " no encontrado.");
    }

    public HashSet<Student> getAllStudents() {
        return students;
    }


}
