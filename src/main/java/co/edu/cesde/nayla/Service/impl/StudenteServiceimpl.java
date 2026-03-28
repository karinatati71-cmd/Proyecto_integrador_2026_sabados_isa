package co.edu.cesde.nayla.Service.impl;
import co.edu.cesde.nayla.repositorio.StudentsRepository
import co.edu.cesde.nayla.Service.impl.StudentService
import co.edu.cesde.nayla.models.Student
import java.util.List
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository StudentRepository;


    public StudentServiceImpl(StudentRepository studentRepository) {
        this.StudentRepository = studentRepository;
    }


    @Override
    public Students create(Students students) {
        if (isInvalidStudent(students) || StudentRepository.existsByDocumentNumber(students.getDocumentNumber()));

        return StudentRepository.create(students);
    }


    private boolean isInvalidStudent(Students students) {
        return students == null

                || !isNotBlank(students.getCode())
                || !isNotBlank(students.getDocumentNumber())
                || !isNotBlank(students.getFirstName())
                || !isNotBlank(students.getLastName())
                || students.getStatus() == null;
    }

    private boolean isNotBlank(String value) {
        return value != null && !value.isBlank();
    }


    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public boolean delete(long studentsId) {
        return false;
    }

    @Override
    public boolean update(Student studentsUpdate) {
        return false;
    }

    @Override
    public Student finById(Long studentId) {
        return null;
    }

    @Override
    public boolean update(Students studentsUpdate) {
        return false;
    }

    @Override
    public Students findById(Long studentsId) {
        return null;
    }

    @Override
    public List<Students> findAll() {
        return List.of();
    }


}
