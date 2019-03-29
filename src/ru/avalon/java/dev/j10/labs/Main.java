package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        
        for (int i = 0; i < 10; i++){
            int b = (int) (Math.random()*300);
            int a = (int) (Math.random() * b);
            int c = (int) (Math.random() * 5);
            
            switch(a){
                case 0:
                    int x = 2+c;
                    int y = 5+c;
                    int z = 4+c;
                    int w = 3+c;
                    
                    shapes[i] = new Triangle("Triangle", x, y, z, w);
                case 1:
                  
                    shapes[i] = new Rectangle(2, a, c);
                case 2:
                    x = 15 + c;
                    
                    shapes[i] = new Circle(x);    
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

