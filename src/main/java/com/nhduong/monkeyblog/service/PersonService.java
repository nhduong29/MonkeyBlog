package com.nhduong.monkeyblog.service;

import java.util.List;

import com.nhduong.monkeyblog.model.Person;

public interface PersonService {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
     
}