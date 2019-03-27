package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon{
    String name;
    int countOfAngle;
    int longOne;
    int longTwo;
    int longThree;
    
    /**
     *
     * @param name
     * @param countOfAngle
     * @param longOne
     * @param longTwo
     * @param longThree
     */
    public Triangle(String name, int countOfAngle, int longOne, int longTwo, int longThree){
        this.name = name;
        this.countOfAngle = countOfAngle;
        this.longOne = longOne;
        this.longTwo = longTwo;
        this.longThree = longThree;
     }

    public int getCountOfAngle() {
        return countOfAngle;
    }

    @Override
    public float getArea() {
        float perimetr = getPerimeter();
        float semiPer = perimetr/2;
        
        float area = (float) Math.sqrt(semiPer * (semiPer - longOne) *(semiPer - longTwo) * (semiPer - longThree));
        
        return area;
    }

    @Override
    public int getRotation() {
        return 0;
    }

    @Override
    public float getPerimeter() {
            int perimeter = longOne + longTwo + longThree;
        return perimeter;
    }

    @Override
    public String getName() {
        return "Triangle";
    }
    
    
        
}
    

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

