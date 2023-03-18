import java.util.Scanner;

public class PrintNumberInWord_B {
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number to be converted into Words: ");
        n=s.nextInt();
        switch(n){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("Please Enter A Proper Number b/w 0-9.");
                break;
        }
    }
}
