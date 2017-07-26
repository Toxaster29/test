package com.test.data;

import com.test.entity.Contact;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Handler{

    public Handler(){}

    public List<Contact> getContactList() {
        List<Contact> contacts = new ArrayList<Contact>();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(String.valueOf(this.getClass().getResource("data.txt"))));
            contacts = (List<Contact>) in.readObject();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    public  void saveContactToFile(List<Contact> contacts) {
        try {
            ObjectOutputStream  out = new ObjectOutputStream(new FileOutputStream(String.valueOf(this.getClass().getClassLoader().getResourceAsStream(String.valueOf(this.getClass().getResource("data.txt"))))));
            out.writeObject(contacts);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
