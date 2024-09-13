package org.lessons.lesson_2.task1;


import java.lang.reflect.*;
import java.util.Arrays;

public class Reflections {

    public static void main(String[] args) throws NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Person person = new Person("Max");
        System.out.println(person);

        Class<? extends Person> personClass = Person.class; //person.getClass();
        Constructor<? extends Person> constructor = personClass.getConstructor(String.class);
        Person anotherPerson = constructor.newInstance("Max");
        System.out.println(anotherPerson);

        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        int i = 1;
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("Constructor #" + i++);
            for (Parameter parameter : declaredConstructor.getParameters()) {
                System.out.println("Parameter #" + parameter.getType());
            }
        }
        System.out.println(declaredConstructors.length);
        System.out.println(Arrays.toString(Reflections.class.getNestMembers()));
        System.out.println(Person.class.getDeclaredConstructors().length);
        System.out.println(Person.class.getConstructors().length);
        System.out.println(ExtPerson.class.getDeclaredConstructors().length);
        System.out.println(ExtPerson.class.getConstructors().length);

        person.setName("Updated");
        System.out.println(person);

        Method method1 = Person.class.getMethod("setName", String.class);
        method1.invoke(person, "Updated#2");
        System.out.println(person);

        Method method2 = Person.class.getMethod("getName");
        System.out.println(method2.invoke(person));

        Method method3 = PrivateMethodHolder.class.getDeclaredMethod("privateMethod");
        method3.setAccessible(true);
        method3.invoke(new PrivateMethodHolder());

        Field name = Person.class.getDeclaredField("name");
        name.setAccessible(true); // с помощью этого метода можно получать и изменять доступ к приватным полям.
        name.set(person, "new Name!");
        System.out.println(person);

    }

}
