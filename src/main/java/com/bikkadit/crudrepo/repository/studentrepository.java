package com.bikkadit.crudrepo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bikkadit.crudrepo.entity.student;

@Repository
public interface studentrepository extends CrudRepository<student, Integer>{
	

}
