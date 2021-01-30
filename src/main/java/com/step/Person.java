package com.step;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

public class Person {
    String name;
    Integer salary;
    Gender gender;
    LocalDate birthdate;

    public Person(String name, Integer salary, Gender gender, LocalDate birthdate) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.birthdate = birthdate;
    }


    // 1. Top 3 persons with biggest salaries
    public static void top3Salaries(List<Person> personList) {
        personList.stream()
                .sorted(((o1, o2) -> o2.salary.compareTo(o1.salary)))
                .limit(3)
                .forEach((Person p) -> System.out.println(p.name + " " + p.salary + " " + p.gender + " " + p.birthdate));
    }

    // 2. First 2 women in the list who are born after 01.01.1990
    public static void twoWomenAfter1990(List<Person> personList) {

        LocalDate date = LocalDate.of(1990, Month.JANUARY, 1);
        personList.stream()
                .filter((Person p) -> p.gender == Gender.FEMALE && p.birthdate.isAfter(date))
                .limit(2)
                .forEach((Person p) -> System.out.println(p.name + " " + p.salary + " " + p.gender + " " + p.birthdate));
    }

    // 3. Information about men from the list
    public static void printMenInfo(List<Person> personList) {
        personList.stream()
                .filter((Person p) -> p.gender == Gender.MALE)
                .forEach((Person p) -> System.out.println(p.name + " " + p.salary + " " + p.gender + " " + p.birthdate));
    }

    // 4. Salaries ordered ascending
    public static void ascendingSalaries(List<Person> personList) {
        personList.stream()
                .map((Person p) -> p.salary)
                .sorted()
                .forEach((Integer salary) -> System.out.println(salary));
    }

    // 5. Unique salaries
    public static void uniqueSalaries(List<Person> personList) {
        personList.stream()
                .map((Person p) -> p.salary)
                .distinct()
                .forEach((Integer salary) -> System.out.println(salary));
    }
}



enum Gender {
    MALE,
    FEMALE
}
