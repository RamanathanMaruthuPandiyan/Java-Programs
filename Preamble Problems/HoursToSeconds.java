import java.util.Scanner;

public class HoursToSeconds {
    static int howManySeconds(int hours){
        return hours*60*60;
    }
    public static void main(String[] args){
        int hours;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Hours: ");
        hours=s.nextInt();
        System.out.println(""+hours+" hours is "+howManySeconds(hours)+" Seconds");
    }
}
