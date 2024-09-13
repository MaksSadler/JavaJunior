package org.lessons.lesson_2.task2;

import org.lessons.lesson_2.task2.rand.RandomInteger;

public class MyClass {

    @RandomInteger(min = 1, max = 90)
    private int integer;

    public int getInteger() {
        return integer;
    }


}
