package com.nhduong.monkeyblog.dao;

import java.util.List;

import com.nhduong.monkeyblog.model.Person;

public interface PersonDAO {
	 
    public void addPerson(Person p);
    public List<Person> listPersons();
}