package co.edu.cesde.nayla.Service.impl;

import co.edu.cesde.nayla.models.Student;

public interface StudentService<list> {
    Student create (Student student);
    boolean delete (long studentId);
    boolean update(Student studentsUpdate);
    Student finById(Long studentId);
    list<Student> findAll();

}
