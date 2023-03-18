import java.util.Scanner;

public class MinutesToSeconds {
    static int convert(int minutes){
        return minutes*60;
    }
    public static void main(String[] args){
        int minutes;
        Scanner s=new Scanner(System.in);
        minutes=s.nextInt();
        System.out.println(""+minutes+" minutes is"+convert(minutes)+" seconds");
    }

}
