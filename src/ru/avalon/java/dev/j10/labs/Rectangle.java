package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon{
    int countOfAngle;
    int sideOne;
    int sideTwo;
    
    public  Rectangle(int countOfAngle, int sideOne, int sideTwo){
        this.countOfAngle = countOfAngle;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }    

    @Override
    public float getPerimeter() {
        return (sideOne * sideTwo)*2;
    }

    @Override
    public String getName() {
        return "Rectangle"; 
    }

    @Override
    public float getArea() {
        return (sideOne * sideTwo); 
    }

    @Override
    public int getRotation(){
        return 0; 
    }


}

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

