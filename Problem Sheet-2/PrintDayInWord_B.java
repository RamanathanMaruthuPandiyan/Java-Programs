import java.util.Scanner;

public class PrintDayInWord_B {
    public static void main(String[] args){
        int Day;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Day to get converted into Words(0-6): ");
        Day=s.nextInt();
        switch(Day){
            case 0:
                System.out.println("SUNDAY");
                break;
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("Please Enter A Proper Number b/w 0-6");
                break;
        }
    }
}
