package com.mike.yi.service;

import java.util.List;

import com.mike.yi.model.Person;

public interface IPersonService {

    /**
     * 加载全部的person
     * @return
     */
    List<Person> loadPersons();
}
