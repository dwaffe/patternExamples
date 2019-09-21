package com.company.patterns;

import com.company.patterns.observer.NewsAgency;
import com.company.patterns.observer.Observer;
import com.company.patterns.observer.ObserverInterface;

public class MainObserver {
    public static void main(String[] args) {
        ObserverInterface observerA = new Observer("Observer A");
        ObserverInterface observerB = new Observer("Observer B");

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addObserver(observerA);
        newsAgency.addObserver(observerB);

        newsAgency.addNews("Kubica rezygnuje z Williams");
        newsAgency.addNews("Będzie mroźna zima");
    }
}
