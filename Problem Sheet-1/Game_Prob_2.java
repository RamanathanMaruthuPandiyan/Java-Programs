import java.util.Scanner;

public class Game_Prob_2 {
    String Game(int a,int b,int c){
        if((c>=a && c<=b ) && b>a){
            return "YOU WIN";
        }
        else{
            return "YOU LOSE";
        }
    }
    public static void main(String[] args){
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Three values: ");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        Game_Prob_2 obj=new Game_Prob_2();
        System.out.println(""+obj.Game(a,b,c));
    }
}
