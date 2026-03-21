package co.edu.cesde.nayla.repositorio;

import co.edu.cesde.nayla.models.Persons.
import co.edu.cesde.nayla.models.Student;

import java.awt.*;

public interface StudentsRepository<Students> {
    Student create(Student student);

    StudentsRepository create(Students student);

    boolean delete(long studentId);
    boolean update(Students studentsUpdate);
    Students findBy(long studentsId);
    boolean findDocumentNumber(String documentNumber);
    List<Students>  findAll();
    boolean existsById(Long studentId);


    Student findById(Long studentId);

    boolean update(Student updatedStudent);

    boolean delete(Long studentId);

    boolean existsByDocumentNumber(String documentNumber);

    int count();
};
