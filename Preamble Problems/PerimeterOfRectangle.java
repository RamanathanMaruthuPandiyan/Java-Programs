import java.util.Scanner;

public class PerimeterOfRectangle {
    static double FindPerimeter(double length,double width){
        return 2*(length+width);
    }
    public static void main(String[] args){
        double length,width;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle: ");
        length=s.nextDouble();
        System.out.println("Enter the width of the Rectangle: ");
        width=s.nextDouble();
        System.out.println("The Perimeter of the Rectangle with "+length+" cm of length and "+width+" cm of width is "+FindPerimeter(length,width));
    }
}
