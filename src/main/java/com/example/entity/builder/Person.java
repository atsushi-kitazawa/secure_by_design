package com.example.entity.builder;

public class Person {

    private String name;
    private String birth;
    private String phoneNumber;

    private Person(String name, String birth) {
        checkNullOrEmpty(name);
        this.name = name;

        checkNullOrEmpty(birth);
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumner(String phoneNumber) {
        checkNullOrEmpty(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("Person [name=%s, birth=%s, phoneNumber=%s]", name, birth, phoneNumber);
    }

    private void checkNullOrEmpty(String s) {
        if(s == null || s.isEmpty()) {
            throw new IllegalArgumentException(String.format("%s is null or empty.", s));
        }
    }

    public static class Builder {

        private Person person;

        public Builder(String name, String birth) {
            person = new Person(name, birth);
        }

        public Builder phoneNumber(String phoneNumber) {
            person.setPhoneNumner(phoneNumber);
            return this;
        }

        public Person build() {
            return person;
        }
    }
}
