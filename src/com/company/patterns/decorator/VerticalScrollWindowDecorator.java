package com.company.patterns.decorator;

public class VerticalScrollWindowDecorator extends WindowDecorator {
    public VerticalScrollWindowDecorator(WindowInterface window) {
        super(window);
    }

    @Override
    public void drawWindow() {
        System.out.println("rysuj pionowy przewijak"); // to jest nowa funkcjonalność
        window.drawWindow();
    }

}
