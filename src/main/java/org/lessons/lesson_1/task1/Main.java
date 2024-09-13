package org.lessons.lesson_1.task1;

public class Main {
    public static void main(String[] args) {

//        PlainInterface plainInterface = new PlainInterface() {
//            @Override
//            public String action(int x, int y) {
//                return String.valueOf(x + y);
//            }
//        }; самостоятельно реализуем интерфейс вручную.

        PlainInterface plainInterface = Integer::sum;
        PlainInterface plainInterface1 = Integer::compare;
        System.out.println(plainInterface.action(6, 7));
        System.out.println(plainInterface1.action(3, 9));

    }
}