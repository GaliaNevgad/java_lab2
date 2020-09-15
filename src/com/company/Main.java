package com.company;
import com.google.gson.*;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Galia", "Nevgad", 19, "Kyiv");

        Gson gson = new Gson();

        String inJSON = gson.toJson(person);
        System.out.println("Converted to JSON " + inJSON);

        String JsonText = "{\"name\":\"Galia\",\"surname\":\"Nevgad\",\"age\":19,\"birthdayCity\":\"Kyiv\"}";

        GsonBuilder outJson = new GsonBuilder();
        gson = outJson.create();
        Person person1;
        person1 = gson.fromJson(JsonText, Person.class);
        System.out.println();
        System.out.println("Converted from JSON" + "\nName: " + person1.name  + "\nSurname: "
                + person1.surname + "\nAge: " + person1.age + "\nBirthday City: " + person1.birthdayCity);

        if(person.hashCode() == person1.hashCode())
        {

            if(person.equals(person1))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");

        }
        else
            System.out.println("Both Objects are not equal. ");
    }
}

