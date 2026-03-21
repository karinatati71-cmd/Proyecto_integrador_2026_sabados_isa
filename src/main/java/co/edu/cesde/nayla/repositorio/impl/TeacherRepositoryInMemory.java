package co.edu.cesde.nayla.repositorio.impl;

import co.edu.cesde.nayla.models.Teacher;
import co.edu.cesde.nayla.models.Teacher;
import co.edu.cesde.nayla.repositorio.TeachersRepository;
import co.edu.cesde.nayla.repositorio.TeachersRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryInMemory implements TeachersRepository {

    private final List<Teacher> teacher;
    private Long nextStudentId;

    public StudentRepositoryInMemory() {
        this.teacher = new ArrayList<>();
        this.nextStudentId = 1L;
    }

    @Override
    public Teacher create(Teacher teacher) {
        if (teacher == null) {
            return null;
        }

        if (existsByDocumentNumber(teacher.getDocumentNumber())) {
            return null;
        }

        teacher.setTeacherId(nextTeacherId++);
        teacher.add(teacher);
        return teacher;
    }

    @Override
    public TeachersRepository create(Object teacher) {
        return null;
    }

    @Override
    public TeachersRepository create(Teacher teacher) {
        return null;
    }

    @Override
    public boolean delete(long teacherId) {
        return false;
    }

    @Override
    public boolean update(Teacher teacherUpdate) {
        return false;
    }

    @Override
    public boolean update(Object teachersUpdate) {
        return false;
    }

    @Override
    public Object findBy(long teachersId) {
        return null;
    }

    @Override
    public boolean findDocumentNumber(String documentNumber) {
        return false;
    }

    @Override
    public List<Teacher> findAll() {
        return new ArrayList<>(teacher);
    }

    @Override
    public boolean existsById(Long teacherId) {
        return false;
    }

    @Override
    public Teacher findById(Long teacherId) {
        if (teacherId == null) {
            return null;
        }

        for (Teacher teacher : teacher) {
            if (teacherId.equals(teacher.getTeacherId())) {
                return teacher;
            }
        }
        return null;
    }

    @Override
    public Teacher findByDocumentNumber(String documentNumber) {
        if (documentNumber == null || documentNumber.isBlank()) {
            return null;
        }

        for (Teacher student : teacher) {
            if (documentNumber.equals(student.getDocumentNumber())) {
                return teacher;
            }
        }
        return null;
    }

    @Override
    public boolean update(Teacher updatedStudent) {
        if (updatedTeacher == null || updatedStudent.getTeacherId() == null) {
            return false;
        }

        for (Teacher teacher1 : teacher) {
            if (!teacher.getTeacherId().equals(updated.Teacher.getTeacherId())
                    && teacher.getDocumentNumber().equals(updated.Teacher.getDocumentNumber())) {
                return false;
            }
        }

        for (int i = 0; i < teacher.size(); i++) {
            if (teacher.get(i).get.teacherId().equals(updatedteacher.getTeacherId())) {
                teacher.set(i, updatedTeacher);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Long teacherId) {
        Teacher teacher = findById(teacherId);
        if (teacher == null) {
            return false;
        }
        return teacher.remove(teacher);
    }

    @Override
    public boolean existsByDocumentNumber(String documentNumber) {
        return findByDocumentNumber(documentNumber) != null;
    }

    @Override
    public int count() {
        return teacher.size();
    }
}
