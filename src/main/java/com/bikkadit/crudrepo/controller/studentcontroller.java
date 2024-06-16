	package com.bikkadit.crudrepo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bikkadit.crudrepo.entity.student;
import com.bikkadit.crudrepo.service.studentservicei;

@Controller
public class studentcontroller {

	@Autowired
private studentservicei studentservicei;
//
//public student savestu(student stu) {
//
//	student stu1= studentservicei.savestudent(stu);
//	
//	return stu1;
//	
//}

public Iterable<student> saveAllstudet(List<student> stus) {
	 Iterable<student> stu1= studentservicei.saveallstudent(stus);
	return stu1;
}
}
