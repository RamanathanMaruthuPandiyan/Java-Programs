import java.util.Scanner;

public class LessThan_Prob_1 {
    static boolean LessThanHundred(int a,int b){
        int sum;
        sum=a+b;
        if(sum<100){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the values: ");
        a=s.nextInt();
        b=s.nextInt();
        if(LessThanHundred(a,b)){
            System.out.println("Yes! Sum of the number's are less than 100");
        }else{
            System.out.println("No! Sum of the number's are not less than 100");
        }
    }
}
