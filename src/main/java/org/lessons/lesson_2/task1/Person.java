package org.lessons.lesson_2.task1;

public class Person {

    private static long counter = 0L;
    private String name;

    public Person() {
        this("unnamed");
    }

    public Person(String name) {
        this.name = name;
        counter++;
    }

    public static long getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
