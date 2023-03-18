abstract class Shape{
    abstract double calculateArea();
    abstract double calculateCircumference();
}
class Circle extends Shape{
    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return 3.14*radius*radius;
    }

    @Override
    double calculateCircumference() {
        return 2*3.14*radius;
    }

}
class Rectangle extends Shape{
    public double width;
    public double height;
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    double calculateArea() {
        return width*height;
    }

    @Override
    double calculateCircumference() {
        return 2*(width+height);
    }
}
class Triangle extends Shape{
    public double sideA;
    public double sideB;
    public double sideC;
    public double S;
    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public double getSideC() {
        return sideC;
    }
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    @Override
    double calculateArea() {
        S=(sideA+sideB+sideC)/2;
        return Math.sqrt(S*(S-sideA)*(S-sideB)*(S-sideC));
    }

    @Override
    double calculateCircumference() {
        return sideA+sideB+sideC;
    }
}


public class TestShape{
    public static void main(String[] args){
        Circle obj=new Circle();
        obj.setRadius(10);
        System.out.println("Area and Circumference of the circle: ");
        System.out.println(obj.calculateArea());
        System.out.println(obj.calculateCircumference());
        Rectangle obj1=new Rectangle();
        obj1.setHeight(50);
        obj1.setWidth(60);
        System.out.println("Area and Perimeter of the rectangle: ");
        System.out.println(obj1.calculateArea());
        System.out.println(obj1.calculateCircumference());
        Triangle obj2=new Triangle();
        obj2.setSideA(20);
        obj2.setSideB(30);
        obj2.setSideC(30);
        System.out.println("Area and Perimeter of the triangle: ");
        System.out.println(obj2.calculateArea());
        System.out.println(obj2.calculateCircumference());
    }
}