package com.test.service;
import com.test.entity.Contact;
import java.util.List;

public interface ContactService {
    List<Contact> getAll();
    Contact getById(Integer id);
    void save(Contact contact);
    void deleteById(Integer id);
    void saveChanges(Contact contact);

}
