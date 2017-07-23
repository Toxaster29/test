package com.test.data;

import com.test.entity.Contact;

import java.util.List;

public interface ContactDAO {
    List<Contact> contactList();
    Contact contactById (Integer id);
    void newContact(Contact contact);
    void updateContact(Contact contact);
    void deleteContact(Integer id);

}
