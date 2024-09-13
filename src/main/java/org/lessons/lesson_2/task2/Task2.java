package org.lessons.lesson_2.task2;


import org.lessons.lesson_2.task2.rand.Homework2;
import org.lessons.lesson_2.task2.rand.RandomDateProcessor;
import org.lessons.lesson_2.task2.rand.RandomIntegerProcessor;

import java.lang.annotation.Annotation;

@MyAnno
public class Task2 {
    public static void main(String[] args) {

        Class<Annotation> annotationClass = Annotation.class;
        MyAnno annotation = annotationClass.getAnnotation(MyAnno.class);

        MyClass myClass = new MyClass();
        RandomIntegerProcessor.processRandomInteger(myClass);
        System.out.println(myClass.getInteger());

        Homework2 homework2 = new Homework2();
        RandomDateProcessor.processRandomDate(homework2);
        System.out.println(homework2.date);
        System.out.println(homework2.localDate);
        System.out.println(homework2.localDateTime);

    }
}
