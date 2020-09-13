package com.company;
import com.google.gson.*;

import java.util.ArrayList;

public class Main {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Galia";
        person.surname = "Nevgad";
        person.age = 19;
        person.hobby = new ArrayList<>();
        person.hobby.add("Books");
        person.hobby.add("Drive a car");
        person.hobby.add("Procrastination");

        Gson gson = new Gson();

        String inJSON = gson.toJson(person);
        System.out.println("Converted to JSON " + inJSON);

        String JsonText = "{\"name\":\"Galia\",\"surname\":\"Nevgad\"," +
                "\"age\":19,\"hobby\":[\"Books\",\"Drive a car\",\"Procrastination\"]}";
        GsonBuilder outJson = new GsonBuilder();
        gson = outJson.create();
        person = gson.fromJson(JsonText, Person.class);
        System.out.println();
        System.out.println("Converted from JSON" + "\nName: " + person.name  + "\nSurname: " + person.surname + "\nAge: " + person.age + "\nHobby: " + person.hobby);



    }
}

