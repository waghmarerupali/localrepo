package com.bikkadit.crudrepo.service;

import java.util.List;

import com.bikkadit.crudrepo.entity.student;

public interface studentservicei {

	
	
	
	public student savestudent(student stu);
	
	
	public Iterable<student> saveallstudent(List<student> stus);
	
}
