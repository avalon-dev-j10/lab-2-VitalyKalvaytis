package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        
        for (int i = 0; i < 10; i++){
            int b = (int) (Math.random());
            double ran = (Math.random()*+3);
            int ranInt = (int) ran;
            int a = ranInt;
            int c = (int) (Math.random() * 5);
            
            switch(a){
                case 0:
                    int x = 2+c;
                    int y = 5+c;
                    int z = 4+c;
                    int w = 3+c;
                    
                    shapes[i] = new Triangle("Triangle", x, y, z, w);
                    break;
                case 1:
                    int g = 20+a+i;
                    int l = 2+c+i;
                    
                    
                    
                    shapes[i] = new Rectangle(2, g, l);
                    break;
                case 2:
                    x = 15 + c;
                    
                    shapes[i] = new Circle(x, 5 , 7);
                    break;
            }
        }
        int[] myArrayInt = new int[10];
        for (int i = 0; i < 10; i++){
            myArrayInt[i] = (int)shapes[i].getArea();
        }
        
        int minArea = 0;
        for (int i = 0; i < 10; i++){
            if(minArea < myArrayInt[i]){
                minArea = myArrayInt[i];
            }
        }
        System.out.println(minArea);
        
        for (int i=0; i<shapes.length; i++){
            System.out.println(shapes[i].getName() +" "+ shapes[i].getArea());
        } 
        
    }
    
}            

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */

