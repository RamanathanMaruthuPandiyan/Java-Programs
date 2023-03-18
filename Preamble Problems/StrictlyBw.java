import java.util.Scanner;

public class StrictlyBw {
    public static void main(String[] Args){
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a>=0 && a<=1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
