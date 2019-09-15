package com.company.patterns;

import com.company.patterns.singleton.NotSingleton;
import com.company.patterns.singleton.Singleton;

public class MainSingleton {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.setMagicNumber(5);
        System.out.println(singleton2.getMagicNumber());


        NotSingleton notSingleton1 = new NotSingleton();
        NotSingleton notSingleton2 = new NotSingleton();

        notSingleton1.setMagicNumber(3);
        System.out.println(notSingleton2.getMagicNumber());
    }
}
