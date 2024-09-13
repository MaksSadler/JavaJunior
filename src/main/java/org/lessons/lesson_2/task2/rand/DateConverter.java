package org.lessons.lesson_2.task2.rand;

@FunctionalInterface
public interface DateConverter<T> {
    T convert(long randomEpochDay);
}
