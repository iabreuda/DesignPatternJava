package com.iabreuda;

public class Main {

    public static void main(String[] args) {
        var singleton = Singleton.getInstance();
        /* Content value for Singleton. */
        System.out.println(singleton.getContent());
        /* Change value for new instance and verify*/
        var singletonSecond = Singleton.getInstance();
        singletonSecond.setContent("SecondInstance");
        System.out.println(singletonSecond.getContent());
        /* Changes will appear here also since it is a unique instance. */
        System.out.println(singleton.getContent());
    }
}