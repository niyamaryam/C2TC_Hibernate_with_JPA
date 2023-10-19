package com.tnsif.jpacrud.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//informing to the program about the database table
@Entity
@Table(name="students")
public class Student implements Serializable {
private static final long serialVersionUID = 1L;
//primary key
@Id
private int studentId;
private String name;
public int getStudentId() {
return studentId;
}
public void setStudentId(int studentId) {
this.studentId = studentId;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
}