package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse, Point{
    int radius;
    int xCoordinate;
    int yCoordinate;
    
    public Circle(int radius, int xCoordinate, int yCoordinate){
        this.radius = radius;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public float getArea() {
        
        float rad2 = (float) Math.pow(radius, 2);
        
        return (float)(rad2*3.14);
    }

    @Override
    public int getRotation() {
        return 0;
    }

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public float getLength() {
        float diam = radius + radius;
        
        return (float)(diam*3.14);
    }

    @Override
    public float getX() {
        return xCoordinate; 
    }

    @Override
    public float getY() {
        return yCoordinate;
    }
}
