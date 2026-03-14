package co.edu.cesde.nayla.app;

import co.edu.cesde.nayla.models.Student ;

import co.edu.cesde.nayla.models.Teacher;

import co.edu.cesde.nayla.models.Persons;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Persons person = new person() ;
        Persons person2 = new person();
        Persons person3 = new person();

        person.setFirstName("Pablo");
        person.getFirstName();
        person2.setFirstName("Rosa");
        person2.getFirstName();
        person3.setFirstName("Sara");
        person3.getFirstName();


        Persons person4 = new Persons(1L, "001", "123456789", "Sofia", "Torro", "hernandez@gmail.com", true) {
            @Override
            public Long getUserId() {
                return super.getUserId();
            }
        };
        person.getFirstName();

        System.out.println(person.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());

        Student student = new Student();
        student.SetFirstName("Maria");
        student.setBirthDate("01/01/2000");
        System.out.println(student.toString());

        Teacher teacher =  new Teacher();
        teacher.SetFirstName("Carlos");
        System.out.println(teacher.toString());

        Student student2 = new Student(2L, "002", "987654321", "Jose", "Perez", "@gmail.com", true, "02/02/2001");
        System.out.println(student2.toString());

        Teacher teacher2 = new Teacher (3L, "003", "456789123", "Maria", "Torres", "@gmail.com", true);
        System.out.println(teacher2.toString());
    }

}
