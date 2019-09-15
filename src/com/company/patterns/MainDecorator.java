package com.company.patterns;

import com.company.patterns.builder.Chef;
import com.company.patterns.builder.Pizza;
import com.company.patterns.builder.pizzaBuilder.HawaiianPizzaBuilder;
import com.company.patterns.builder.pizzaBuilder.MargaritaPizzaBuilder;
import com.company.patterns.builder.pizzaBuilder.MeetPizzaBuilder;
import com.company.patterns.decorator.HorizontalScrollWindowDecorator;
import com.company.patterns.decorator.VerticalScrollWindowDecorator;
import com.company.patterns.decorator.Window;
import com.company.patterns.decorator.WindowDecorator;

public class MainDecorator {

    public static void main(String[] args) {
        Window window = new Window();
        WindowDecorator scrollWindow =
                new HorizontalScrollWindowDecorator(
                    new VerticalScrollWindowDecorator(window)
                );

        scrollWindow.drawWindow();

    }
}
