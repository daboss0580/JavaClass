package GroupExcercise;

public interface Shape {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.
     */
    double height=18.6;
    double width=18.6;
    double radius=12.0;
    static double pi=3.14;
    void calculateArea();
    void calculatePerimiter();

    }



class Circle implements Shape{


    @Override
    public void calculateArea() {
        double area=pi*radius*radius;
        System.out.println(area);
    }

    @Override
    public void calculatePerimiter() {
        double perimeter=2*pi*radius;
        System.out.println(perimeter);
    }
}
class Square implements Shape{
    public void calculateArea(){
        double area=height*width;
        System.out.println(area);
    }
    public void calculatePerimiter(){
        double perimeter=(height+width)*2;
        System.out.println(perimeter);
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Circle circle=new Circle();
        Square square=new Square();
        circle.calculateArea();
        circle.calculatePerimiter();
        square.calculateArea();
        square.calculatePerimiter();

    }
}