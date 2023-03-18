import java.util.Scanner;

public class Power {
    static int Pow(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        int Vol,Cur;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Voltage and current to Calculate Power: ");
        Vol=s.nextInt();
        Cur=s.nextInt();
        System.out.println("The Power is : "+Pow(Vol,Cur));
    }

}
