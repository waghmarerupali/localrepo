package com.bikkadit.crudrepo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bikkadit.crudrepo.controller.studentcontroller;
import com.bikkadit.crudrepo.entity.student;

@SpringBootApplication
public class Crudrepomethods1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Crudrepomethods1Application.class, args);
	
	
		studentcontroller studentcontroller=context.getBean(studentcontroller.class);
		
		student stu=new student();
		stu.setSid(1);
		stu.setSadd("nilanga");
		stu.setSname("rupa");
		stu.setSrank("1gg");
		
		
		
		
		student stu1=new student();
		stu1.setSid(2);
		stu1.setSadd("nilanga");
		stu1.setSname("dipa");
		stu1.setSrank("1gg");
		
		
		
		student stu2=new student();
		stu2.setSid(3);
		stu2.setSadd("nilanga");
		stu2.setSname("seema");
		stu2.setSrank("1gg");
		
		List l=new ArrayList();
		l.add(stu);
		l.add(stu1);
		l.add(stu2);
		
		
		
		
		
		
		Iterable<student> student= studentcontroller.saveAllstudet(l);
		
		
		System.out.println(student);
	}

}
