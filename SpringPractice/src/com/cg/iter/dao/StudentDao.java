package com.cg.iter.dao;
import java.util.List;

import com.cg.iter.bean.Student;



public interface StudentDao {

	boolean create(Student stud);
	boolean update(Student id);
	boolean delete(int id);
	Student find(int id);
	Student findbyName(String name);
	List<Student> getAll();
	
	}

