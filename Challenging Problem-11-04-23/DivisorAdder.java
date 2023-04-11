import java.util.Scanner;

interface AdvancedArithmetic{
    public int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        int DivSum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                DivSum+=i;
            }
        }
        DivSum+=n;
        return DivSum;
    }
    
}
public class DivisorAdder {
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to find the its divisor sum: ");
        n=s.nextInt();
        AdvancedArithmetic Ac=new MyCalculator();
        int value=Ac.divisor_sum(n);
        System.out.println("The Sum of all the divisors of "+n+" is:"+value);

    }
}
