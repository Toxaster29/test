package com.test.controller;

import com.test.entity.Contact;
import com.test.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private ContactService service;

/*    @RequestMapping(value="/test",method = RequestMethod.GET)
    @ResponseBody
    public  String test(ModelMap model){
        Contact c1= new Contact(1,"Василий","Грюмов","Сергеевич",new Date(1992,3,5),"88928538928");
       Contact c2= new Contact(2,"Игорь","Трофимов","Алексеевич",new Date(1982,5,12),"88925152928");
        service.save(c1);
        service.save(c2);
        return "good";
    }*/

    @RequestMapping(value="/contacts",method = RequestMethod.GET)
    @ResponseBody
    public List<Contact> getAllContacts(){
        return service.getAll();
    }

    @RequestMapping(value="/contacts/{id}",method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public  Contact getContact(@PathVariable Integer id){
         return service.getById(id);
    }

    @RequestMapping(value="/contacts",method = RequestMethod.POST)
    public  void saveContact(@RequestBody Contact contact){
        service.save(contact);
    }

    @RequestMapping(value="/contacts/{id}",method = RequestMethod.DELETE)
    public  void deleteContact(@PathVariable Integer id){
        service.deleteById(id);
    }

    @RequestMapping(value="/contacts",method = RequestMethod.PUT)
    public  void updateContact(@RequestBody Contact contact){
        service.saveChanges(contact);
    }
}
