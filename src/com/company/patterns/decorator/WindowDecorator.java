package com.company.patterns.decorator;

public abstract class WindowDecorator implements WindowInterface {
    WindowInterface window;

    public WindowDecorator(WindowInterface window) {
        this.window = window;
    }
}
