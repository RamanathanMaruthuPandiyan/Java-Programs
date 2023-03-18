import java.util.Scanner;

import javax.xml.transform.Source;

public class Increment {
    static int Addition(int n){
        return n+1;
    }
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n=s.nextInt();
        System.out.println(""+n+" is added be 1 is "+Addition(n));
    }
}
