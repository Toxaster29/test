package com.test.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class Contact implements Serializable {
    //@GeneratedValue(generator="increment")
    @Id
    @Column(name="ID")
    private Integer id;

    @Column(name="FIRSTNAME")
    private String firstname;

    @Column (name="SECONDAME")
    private  String secondname;

    @Column (name="PATRONIMIC")
    private String patronimic;

    @Column (name="BIRTHDATE")
    private Date birthdate;

    @Column (name="TELEPHONE")
    private String telephone;

    public  Contact(){};

    public Contact(Integer id,String firstname,String secondname, String patronimic, Date birthdate,String telephone){
        this.id=id;
        this.firstname=firstname;
        this.secondname=secondname;
        this.patronimic=patronimic;
        this.birthdate=birthdate;
        this.telephone=telephone;
    }

    public Integer getId(){
        return id;
    }

    public void setId (Integer id){this.id=id;}

    public String getFirstname(){
        return  firstname;
    }

    public void  setFirstname(String firstname){
        this.firstname=firstname;
    }

    public  String getSecondname(){
        return secondname;
    }

    public  void setSecondname(String secondname){
        this.secondname=secondname;
    }

    public String getPatronimic(){
        return patronimic;
    }

    public void setPatronimic(String patronimic){
        this.patronimic=patronimic;
    }

    public Date getBirthdate(){
        return birthdate;
    }

    public void setBirthdate(Date birthdate){
        this.birthdate=birthdate;
    }

    public String getTelephone(){
        return telephone;
    }

    public void setTelephone(String telephone){
        this.telephone=telephone;
    }

}
