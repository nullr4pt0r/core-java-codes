package deepCopy;

public class Point {
    // write the code of point class here
    int x,y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //create a copy constructor
    Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }
}
