package com.company.patterns;

interface ShapeInterface {
    public void draw(int x1, int y1, int x2, int y2);
}

class LineAdapter implements ShapeInterface {
    private Line line;

    public LineAdapter(Line line) {
        this.line = line;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        line.draw(x1, y1, x2, y2);
    }
}

class RectangleAdapter implements ShapeInterface {
    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int width = Math.abs(x1 - x2);
        int height = Math.abs(y1 - y2);
        rectangle.draw(x1, y1, width, height);
    }
}

class Line {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Line from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 + ")");
    }
}

class Rectangle {
    public void draw(int x, int y, int width, int height) {
        System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }
}

public class MainAdapter {

//    Stary kod bez adapterów:

//    public static void main(String[] args) {
//        Object[] shapes = {new Line(), new Rectangle()};
//        int x1 = 10, y1 = 20;
//        int x2 = 30, y2 = 60;
//        int width = 40, height = 40;
//        for (Object shape : shapes) {
//            if (shape.getClass().getSimpleName().equals("Line")) {
//                ((Line)shape).draw(x1, y1, x2, y2);
//            } else if (shape.getClass().getSimpleName().equals("Rectangle")) {
//                ((Rectangle)shape).draw(x2, y2, width, height);
//            }
//        }
//    }

    public static void main(String[] args) {
        ShapeInterface[] shapes = {
                new LineAdapter(new Line()),
                new RectangleAdapter(new Rectangle())
        };
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        for (ShapeInterface shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}