import java.util.Scanner;
import java.lang.Math;
public class StrongNumber {
    static int Fact(int DigitNumber){
        if(DigitNumber==0){
            return 1;
        }
        else{
            return Fact(DigitNumber-1)*DigitNumber;
        }
    }
    public static void main(String[] args){
        int res=0,DigitNumber,Number,Original_Num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to check for Strong: ");
        Number=s.nextInt();
        Original_Num=Number;
        for(int i=0;i<Math.floor(Math.log10(Original_Num)+1);i++){
            DigitNumber=Number%10;
            System.out.println("DigitNumber :"+DigitNumber);
            res=res+Fact(DigitNumber);
            System.out.println("Result :"+res);
            Number/=10;
        }
        if(res==Original_Num){
            System.out.println("Yes! "+Original_Num+" is a Strong Number");
        }
        else{
            System.out.println("No! "+Original_Num+" is not a Strong Number");
        }
    }

}
