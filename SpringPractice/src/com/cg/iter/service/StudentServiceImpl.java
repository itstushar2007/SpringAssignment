package com.cg.iter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.bean.Student;
import com.cg.iter.dao.StudentDao;
import com.cg.iter.util.JpaUtil;

@Service("studentService")
  public class StudentServiceImpl implements StudentService {
		@Autowired
	    private StudentDao studDao;
		public StudentServiceImpl() {
			System.out.println("stud service constr");
		}
		
		@Override
		public boolean create(Student stud) {
			return studDao.create(stud);
		}
		@Override
		public boolean update(Student id) {
			return studDao.update(id);
		}
		@Override
		public boolean delete(int id) {
			return studDao.delete(id);
		}
		@Override
		public Student find(int id) {
			return studDao.find(id);
		}
		@Override
		public Student findbyName(String name) {
			return studDao.findbyName(name);
		}
		@Override
		public List<Student> getAll() {
	        return studDao.getAll();
		}
		
	   
	}



