package co.edu.cesde.nayla.models;

import javax.xml.crypto.dom.DOMCryptoContext;

public class Student extends Persons {

    private Long studentId;
    private String birthDate;

    public Student() {
        super();
    }

    public Student(Long userId, String documentType, String documentNumber, String firstName, String lastName, String status, String birthDate) {
        super(userId, documentType, documentNumber, firstName, lastName, status);
        this.birthDate = birthDate;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getbirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", userId=" + getUserId() +
                ", documentType='" + getDocumentType() + '\'' +
                ", documentNumber='" + getDocumentNumber() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }
}
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long StudentId) {
        this.StudentI= studentId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", userId=" + getUserId() +
                ", documentType='" + getDocumentType() + '\'' +
                ", documentNumber='" + getDocumentNumber() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }
}