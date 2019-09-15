package com.company.patterns.decorator;

public class HorizontalScrollWindowDecorator extends WindowDecorator {

    public HorizontalScrollWindowDecorator(WindowInterface window) {
        super(window);
    }

    public void drawWindow() {
        System.out.println("rysuje poziomy przewijak");
        window.drawWindow();
    }

}
