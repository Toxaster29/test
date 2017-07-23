package com.test.service;

import com.test.data.ContactDAO;
import com.test.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImp implements ContactService {

    @Autowired
    private ContactDAO contactDAO;

    public List<Contact> getAll() {
        return contactDAO.contactList();
    }

    public Contact getById(Integer id) {
        return contactDAO.contactById(id);
    }

    public void save(Contact contact) {
        contactDAO.newContact(contact);
    }

    public void deleteById(Integer id) {
        contactDAO.deleteContact(id);
    }

    public void saveChanges(Contact contact) {
        contactDAO.updateContact(contact);
    }
}
