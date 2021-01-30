package com.step;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList();

        persons.add(new Person("Mihaela", 12500, Gender.FEMALE, LocalDate.parse("2000-12-15")));
        persons.add(new Person("Ionela", 13000, Gender.FEMALE, LocalDate.parse("1999-03-17")));
        persons.add(new Person("Valeria", 12500, Gender.FEMALE, LocalDate.parse("1997-11-06")));

        persons.add(new Person("Ion", 13500, Gender.MALE, LocalDate.parse("1996-12-12")));
        persons.add(new Person("Mihai", 11500, Gender.MALE, LocalDate.parse("1988-07-23")));
        persons.add(new Person("Victor", 14000, Gender.MALE, LocalDate.parse("1986-11-26")));

        System.out.println("\n Ex 1.");
        Person.top3Salaries(persons);

        System.out.println("\n Ex 2.");
        Person.twoWomenAfter1990(persons);

        System.out.println("\n Ex 3.");
        Person.printMenInfo(persons);

        System.out.println("\n Ex 4.");
        Person.ascendingSalaries(persons);

        System.out.println("\n Ex 5.");
        Person.uniqueSalaries(persons);

    }
}
