import java.util.Scanner;

public class CelsiusToFahren{
    public static void main(String[] args){
        double celsius,fahren;
        System.out.println("Enter the celsius: ");
        Scanner s=new Scanner(System.in);
        celsius=s.nextDouble();
        fahren=((9/5)*celsius)+32;
        System.out.println("The Fahrenheit is: "+fahren);
    }

}