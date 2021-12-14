package com.example.entity.builder;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testCreate() {
        Person person = new Person.Builder("aaa", "2000/1/1").phoneNumber("000-0000-0000").build();

        assertThat(person.getName(), CoreMatchers.is("aaa"));
        assertThat(person.getBirth(), CoreMatchers.is("2000/1/1"));
        assertThat(person.getPhoneNumber(), CoreMatchers.is("000-0000-0000"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNameNull() {
        new Person.Builder(null, "2000/1/1").phoneNumber("000-0000-0000").build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNameEmpty() {
        new Person.Builder("", "2000/1/1").phoneNumber("000-0000-0000").build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBirthNull() {
        new Person.Builder("aaa", null).phoneNumber("000-0000-0000").build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBirthEmpty() {
        new Person.Builder("aaa", "").phoneNumber("000-0000-0000").build();
    }
}
