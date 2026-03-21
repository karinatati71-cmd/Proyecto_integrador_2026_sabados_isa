package co.edu.cesde.nayla.repositorio;

import co.edu.cesde.nayla.models.Teacher;

import java.awt.*;

public interface TeachersRepository {

    co.edu.cesde.nayla.repositorio.StudentsRepository create(Teacher teacher);

        boolean delete(long studentId);
        boolean update(Teacher teacherUpdate);
        Teacher findBy(long teacherId);

        List<Teacher> findAll();
    boolean findDocumentNumber(String documentNumber);
        boolean existsById(Long teacherId);


    }
}
