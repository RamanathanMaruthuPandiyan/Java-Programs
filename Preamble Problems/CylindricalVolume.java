import java.util.Scanner;
import java.lang.Math;
public class CylindricalVolume {
    public static void main(String[] args){
        double area,length,volume,radius;
        System.out.println("Enter the Radius of the Cylinder: ");
        Scanner s=new Scanner(System.in);
        radius=s.nextDouble();
        System.out.println("Enter the Length of the Cylinder: ");
        length=s.nextDouble();
        area=Math.pow(radius,2)*(3.14);
        volume=area*length;
        System.out.println("The Volume of the Cylinder is: "+volume);
    }
}
