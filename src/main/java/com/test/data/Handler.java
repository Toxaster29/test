package com.test.data;

import com.test.entity.Contact;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Handler{

    private String fileName="C:\\Users\\assze_000\\IdeaProjects\\ContactTestTask\\src\\main\\java\\com\\test\\data\\data.txt";

    public Handler(){}

    public List<Contact> getContactList() {
        List<Contact> contacts = new ArrayList<Contact>();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
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
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(contacts);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
