package com.company;

import java.util.List;

public class Person {
    String name;
    String surname;
    int age;
    String birthdayCity;

    public Person(String name, String surname, int age, String birthdayCity){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthdayCity = birthdayCity;
    }

    @Override
    public boolean equals(Object o) {
       if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person personEq = (Person) o;
        if (!this.name.equalsIgnoreCase(personEq.name)) {
            return false;
        }else if(!this.surname.equalsIgnoreCase(personEq.surname)){
            return false;
        }else if(this.age !=personEq.age){
            return false;
        }else return this.birthdayCity.equalsIgnoreCase(personEq.birthdayCity);
    }

    @Override
    public int hashCode()
    {
        return this.age;
    }
}
