public class Rectangle implements Polygon{
    int countOfAngle;
    int sideOne;
    int sideTwo;
    
    
    public  Rectangle(int countOfAngle, Point a, Point b, Point c){
        this.countOfAngle = countOfAngle;
        
        float aX = a.getX();
        float aY = a.getY();
        
        float bX = b.getX();
        float bY = b.getY();
        
        float cX = c.getX();
        float cY = c.getY();
        
        float oneX = (bX-aX)*(bX-aX);
        float oneY = (bY-aY)*(bY-aY);
        float summXYOne = oneX + oneY;
        this.sideOne = (int) Math.sqrt(summXYOne);
        
        float twoX = (cX-bX)*(cX-bX);
        float twoY = (cY-bY)*(cY-bY);
        float summXYTwo = twoX + twoY;
        this.sideTwo = (int) Math.sqrt(summXYTwo);
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

