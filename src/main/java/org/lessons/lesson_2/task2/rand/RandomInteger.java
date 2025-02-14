package org.lessons.lesson_2.task2.rand;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface RandomInteger {
    int min() default 0;
    int max() default 100;

    //Здесь можно использовать только:
    //Все примитивы
    //Class
    //String
    //Enum
    //Массивы всего что написано выше
}
