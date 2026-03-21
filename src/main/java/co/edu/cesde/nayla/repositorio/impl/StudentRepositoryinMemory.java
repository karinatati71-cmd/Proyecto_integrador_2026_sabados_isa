package co.edu.cesde.nayla.repositorio.impl;

import co.edu.cesde.nayla.models.Student;
import co.edu.cesde.nayla.repositorio.StudentsRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryInMemory implements StudentsRepository {

    private final List<Student> students;
    private Long nextStudentId;

    public StudentRepositoryInMemory() {
        this.students = new ArrayList<>();
        this.nextStudentId = 1L;
    }

    @Override
    public Student create(Student student) {
        if (student == null) {
            return null;
        }

        if (existsByDocumentNumber(student.getDocumentNumber())) {
            return null;
        }

        student.setStudentId(nextStudentId++);
        students.add(student);
        return student;
    }

    @Override
    public StudentsRepository create(Object student) {
        return null;
    }

    @Override
    public boolean delete(long studentId) {
        return false;
    }

    @Override
    public boolean update(Object studentsUpdate) {
        return false;
    }

    @Override
    public Object findBy(long studentsId) {
        return null;
    }

    @Override
    public boolean findDocumentNumber(String documentNumber) {
        return false;
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public boolean existsById(Long studentId) {
        return false;
    }

    @Override
    public Student findById(Long studentId) {
        if (studentId == null) {
            return null;
        }

        for (Student student : students) {
            if (studentId.equals(student.getStudentId())) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student findByDocumentNumber(String documentNumber) {
        if (documentNumber == null || documentNumber.isBlank()) {
            return null;
        }

        for (Student student : students) {
            if (documentNumber.equals(student.getDocumentNumber())) {
                return student;
            }
        }
        return null;
    }

    @Override
    public boolean update(Student updatedStudent) {
        if (updatedStudent == null || updatedStudent.getStudentId() == null) {
            return false;
        }

        for (Student student : students) {
            if (!student.getStudentId().equals(updatedStudent.getStudentId())
                    && student.getDocumentNumber().equals(updatedStudent.getDocumentNumber())) {
                return false;
            }
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(updatedStudent.getStudentId())) {
                students.set(i, updatedStudent);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Long studentId) {
        Student student = findById(studentId);
        if (student == null) {
            return false;
        }
        return students.remove(student);
    }

    @Override
    public boolean existsByDocumentNumber(String documentNumber) {
        return findByDocumentNumber(documentNumber) != null;
    }

    @Override
    public int count() {
        return students.size();
    }
}