package com.vektorel.java15.genericlistview;

/**
 * Created by vektorel on 08.01.2017.
 */
public class Person {

    String name;
    String number;

    public Person(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
