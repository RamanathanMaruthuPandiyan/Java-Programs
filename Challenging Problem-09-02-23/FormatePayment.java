import java.util.*;
import java.text.*;
public class FormatePayment {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double payment;
        if(args.length!=0){
            payment=Double.parseDouble(args[0]);
        }
        else{
            System.out.println("Enter the Amount: ");
            payment=s.nextDouble();
        }
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("us: "+us.format(payment));
        System.out.println("India: "+india.format(payment));
        System.out.println("China: "+china.format(payment));
        System.out.println("France: "+france.format(payment));
    }
}

