package com.company.patterns.observer;

import java.util.ArrayList;

public class NewsAgency {
    private ArrayList<String> newsFeed = new ArrayList<>();
    private ArrayList<ObserverInterface> observers = new ArrayList<>();

    public void addObserver(ObserverInterface observer) {
        observers.add(observer);
    }

    public void addNews(String news) {
        newsFeed.add(news);
        notifyObservers(news);
    }

    private void notifyObservers(String news) {
        for (ObserverInterface observer: observers) {
            observer.updateNews(news);
        }
    }
}
