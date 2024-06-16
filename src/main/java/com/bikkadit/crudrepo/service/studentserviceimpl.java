package com.bikkadit.crudrepo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadit.crudrepo.entity.student;
import com.bikkadit.crudrepo.repository.studentrepository;


@Service
public class studentserviceimpl  implements studentservicei{

	@Autowired
	private studentrepository  	studentrepository ;
	
	@Override
	public student savestudent(student stu) {
		student student = studentrepository.save(stu);
	
		return student;
	}

	@Override
	public Iterable<student> saveallstudent(List<student> stus) {
		
		
		
		Iterable<student> saveAll = studentrepository.saveAll(stus);
		return saveAll;
	}
	
	
}
