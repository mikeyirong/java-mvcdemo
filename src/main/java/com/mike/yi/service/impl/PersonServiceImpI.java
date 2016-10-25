
package com.mike.yi.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mike.yi.dao.PersonMapper;
import com.mike.yi.model.Person;
import com.mike.yi.service.IPersonService;

@Service("personService")
public class PersonServiceImpI implements IPersonService {
    
    private PersonMapper personMapper;

    public PersonMapper getPersonMapper() {
        return personMapper;
    }
    @Autowired
    public void setPersonMapper(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }
 
	public List<Person> loadPersons() {
		return personMapper.queryAll();
	}
}
