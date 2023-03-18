import java.util.Scanner;

public class PrintNumberInWord_A {
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number to be converted into Words: ");
        n=s.nextInt();
        if(n>0 && n<=9){
            if(n==1){
                System.out.println("ONE");
            }
            else if(n==2){
                System.out.println("TWO");
            }
            else if(n==3){
                System.out.println("THREE");
            }
            else if(n==4){
                System.out.println("FOUR");
            }
            else if(n==5){
                System.out.println("FIVE");
            }
            else if(n==6){
                System.out.println("SIX");
            }
            else if(n==7){
                System.out.println("SEVEN");
            }
            else if(n==8){
                System.out.println("EIGHT");
            }
            else if(n==9){
                System.out.println("NINE");
            }
        }
        else{
            System.out.println("Please Enter a number b/w 0-9.");
        }
    }
}
