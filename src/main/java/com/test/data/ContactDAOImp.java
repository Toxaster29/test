package com.test.data;

import com.test.entity.Contact;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDAOImp implements ContactDAO {

    private Handler ser = new Handler();

    public List<Contact> contactList() {
        return ser.getContactList();
    }

    public Contact contactById(Integer id) {
        List<Contact> contacts = ser.getContactList();
        Integer contactID=-1;
        for (Contact con:contacts) {
            if(id.equals(con.getId())) contactID=contacts.indexOf(con);
        }
        return contacts.get(contactID);
    }

    public void newContact(Contact contact) {
        List<Contact> con = ser.getContactList();
        con.add(contact);
        ser.saveContactToFile(con);
    }

    public void updateContact(Contact contact) {
        List<Contact> contacts = ser.getContactList();
        for (Contact con:contacts) {
            if(contact.getId().equals(con.getId())) {
              Integer  contactID = contacts.indexOf(con);
                contacts.set(contactID,contact);
                ser.saveContactToFile(contacts);
            }
        }
    }

    public void deleteContact(Integer id) {
        List<Contact> contacts = ser.getContactList();
        Integer contactID=-1;
        for (Contact con:contacts) {
            if(id.equals(con.getId())) contactID=contacts.indexOf(con);
        }
        contacts.remove(contactID);
        ser.saveContactToFile(contacts);
    }
}
