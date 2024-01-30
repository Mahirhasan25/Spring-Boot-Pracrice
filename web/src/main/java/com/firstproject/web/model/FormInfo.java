package com.firstproject.web.model;

import jakarta.persistence.*;

@Entity
public class FormInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(name = "Programmer_name")
    public String name;
    public String lang;
    public FormInfo() {

    }


    public FormInfo(int id, String name, String lang) {
        this.id = id;
        this.name = name;
        this.lang = lang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + " Language: " + lang;
    }
}
