package com.company;

import java.util.HashSet;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("John", 25);
        Person p2 = new Person("John", 25);
        set.add(p1);
        set.add(p2);
        System.out.println(set.size()); // output: 2
    }
}


