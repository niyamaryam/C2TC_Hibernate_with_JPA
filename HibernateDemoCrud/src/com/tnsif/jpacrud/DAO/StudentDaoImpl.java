package com.tnsif.jpacrud.DAO;
import javax.persistence.EntityManager;

import com.tnsif.jpacrud.entities.Student;
public class StudentDaoImpl implements StudentDao 
{
private EntityManager entityManager;
public StudentDaoImpl() {
entityManager = JPAUtil.getEntityManager();
}
//retrival
@Override
public Student getStudentById(int id) {
Student student = entityManager.find(Student.class, id);//no sql query
return student;
}
@Override
public void addStudent(Student student) {
entityManager.persist(student);
}
@Override
public void removeStudent(Student student) {
entityManager.remove(student);
}
@Override
public void updateStudent(Student student) {
entityManager.merge(student);
}
@Override
public void beginTransaction() {
entityManager.getTransaction().begin();
}
@Override
public void commitTransaction() {
entityManager.getTransaction().commit();
	
}
}