package com.mike.yi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mike.yi.model.Person;
import com.mike.yi.service.IPersonService;

@Controller
@RequestMapping("/personController")
public class PersonController {
    
    private IPersonService personService;
    
    public IPersonService getPersonService() {
        return personService;
    }

    @Autowired
    public void setPersonService(IPersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/showPerson")
    public String showPersons(Model model){
        List<Person> persons = personService.loadPersons();
        model.addAttribute("persons", persons);
        return "showperson";
    }
    
    /**
     * 插入数据到数据库
     */
    
    @RequestMapping(value="/addPerson")
    public void insertPerson(HttpServletRequest request){
    	String id = request.getParameter("id");
    	String name =request.getParameter("name") ;
    	String password = request.getParameter("password");
    	System.out.println("request is"+request.getParameter("name"));
    	
    }
}
