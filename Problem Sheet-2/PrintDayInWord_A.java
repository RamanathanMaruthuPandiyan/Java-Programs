import java.util.Scanner;

public class PrintDayInWord_A {
    public static void main(String[] args){
        int Day;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Day to get converted into Words(0-6): ");
        Day=s.nextInt();
        if(Day>=0 && Day<=6){
            if(Day==0){
                System.out.println("SUNDAY");
            }
            else if(Day==1){
                System.out.println("MONDAY");
            }
            else if(Day==2){
                System.out.println("TUESDAY");
            }
            else if(Day==3){
                System.out.println("WEDNESDAY");
            }
            else if(Day==4){
                System.out.println("THURSDAY");
            }
            else if(Day==5){
                System.out.println("FRIDAY");
            }
            else{
                System.out.println("SATURDAY");
            }
        }
        else{
            System.out.println("Please Enter A Proper Number b/w 0-6");
        }
    }

}
