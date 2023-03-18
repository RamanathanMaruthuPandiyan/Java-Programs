import java.util.Scanner;

public class SumTwoNumbers {
    static int SumOfTwoNumbers(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("The Sum of "+a+" and "+b+" is "+SumOfTwoNumbers(a, b));
    }
}
