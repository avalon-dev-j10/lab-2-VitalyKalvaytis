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
}
