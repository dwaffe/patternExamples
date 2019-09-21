package com.company.patterns.observer;

public class Observer implements ObserverInterface {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    private void printNews(String news) {
        System.out.println(name + ": " + news);
    }

    @Override
    public void updateNews(String news) {
        printNews(news);
    }
}
