package com.example.entity.builder;

public class PersonUser {
    public static void main(String[] args) {
        Person p1 = new Person.Builder("aaa", "2000/1/1").phoneNumber("000-0000-0000").build();
        System.out.println(p1);
    }
}
