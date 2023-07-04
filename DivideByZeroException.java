import java.util.*;

public class DivideByZeroException{
    public static void main(String[] args){
        int n, i=0, k=0, res;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the No of Elements : ");
        n = in.nextInt();

        //Declaring Two Arrays of Length n. One for Dividend and another for Divisor
        int dividend[] = new int[n];
        int divisor[] = new int[n];

        //Getting input from the Users for the corresponding index Dividend and Divisor
        for(i=0;i<n;i++){
            System.out.print("Enter the Dividend Number : ");
            dividend[i] = in.nextInt();
            System.out.print("Enter the Divisor Number : ");
            divisor[i] = in.nextInt();
        }

        System.out.println("\n\n");

        //For each Index value making the Division of Dividend by Divisor
        for(k=0;k<n;k++){
            try{
                //If it raises an Exception corresponding Catch block will be Executed
                res = dividend[k]/divisor[k];
                System.out.println("Index : "+k+" Result Value : "+res);
            }
            catch(ArithmeticException AE){
              System.out.println("Index : "+k+" ArithmeticException (DivideByZero)");
            }
        }
        in.close();
    }
}