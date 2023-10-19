package com.tnsif.jpacrud.service;
import com.tnsif.jpacrud.DAO.StudentDao;
import com.tnsif.jpacrud.DAO.StudentDaoImpl;
import com.tnsif.jpacrud.entities.Student;
public class StudentServiceImpl implements StudentService {
private StudentDao dao;
public StudentServiceImpl() 
 {
dao = new StudentDaoImpl();
}


@Override
public void addStudent(Student student) 
{
	dao.beginTransaction();
	dao.addStudent(student);
	dao.commitTransaction();
	
}
@Override
public Student findStudentById(int id)
{
	Student student = dao.getStudentById(id);
	return student;
}

@Override
public void updateStudent(Student student) 
{
	dao.beginTransaction();
	dao.updateStudent(student);
	dao.commitTransaction();
	
}

@Override
public void removeStudent(Student student) 
{
	dao.beginTransaction();
	dao.removeStudent(student);
	dao.commitTransaction();
	
}



}
