import java.util.Scanner;

import javax.xml.transform.Source;

public class ConvertAgeToDays {
    static int calcAge(int Age){
        return Age*365;
    }
    public static void main(String[] args){
        int Age,Year;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the age: ");
        Age=s.nextInt();
        System.out.println("Enter the Year of Birth: ");
        Year=s.nextInt();
        System.out.println("Enter the age: ");
        Age=s.nextInt();
        System.out.println("The "+Age+" in Days is "+calcAge(Age));
    }

}
