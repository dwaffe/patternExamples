package com.company.patterns.singleton;

public class NotSingleton {
    private int magicNumber;

    public NotSingleton() {
    }

    public int getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(int magicNumber) {
        this.magicNumber = magicNumber;
    }
}
