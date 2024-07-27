package deepCopy;

public class Rectangle {
    // write the code of Rectangle class here
    Point topLeft;
    Point bottomRight;

    Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY){
        this.topLeft = new Point(topLeftX,topLeftY);
        this.bottomRight = new Point(bottomRightX,bottomRightY);
    }
    Rectangle(Point topLeft, Point bottomRight){
        this.topLeft = new Point(topLeft.x, topLeft.y);
        this.bottomRight = new Point(bottomRight.x, bottomRight.y);
    }
    Rectangle(Rectangle rectangle){
        this(rectangle.topLeft, rectangle.bottomRight);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10,20,30,40);
        Rectangle rectangle2 = new Rectangle(rectangle1);
        System.out.println(rectangle1.topLeft.x+" "+rectangle1.topLeft.y+" "+rectangle1.bottomRight.x+" "+rectangle1.bottomRight.y);
        System.out.println(rectangle2.topLeft.x+" "+rectangle2.topLeft.y+" "+rectangle2.bottomRight.x+" "+rectangle2.bottomRight.y);
        rectangle1.topLeft.x = 100;
        System.out.println(rectangle1.topLeft.x+" "+rectangle1.topLeft.y+" "+rectangle1.bottomRight.x+" "+rectangle1.bottomRight.y);
        System.out.println(rectangle2.topLeft.x+" "+rectangle2.topLeft.y+" "+rectangle2.bottomRight.x+" "+rectangle2.bottomRight.y);
    }
}
