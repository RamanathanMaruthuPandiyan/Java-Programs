import java.util.Scanner;

public class WindSpeed {
    public static void main(String[] args){
        int WS;
        Scanner s=new Scanner(System.in);
        if(args.length!=0){
            WS=s.nextInt();
        }
        else{
            System.out.println("Enter the Wind Speed: ");
            WS=s.nextInt();
        }
        if(WS>=74 && WS<=95){
            System.out.println("level 1 Hurricane.");
        }
        else if(WS>=96 && WS<=110){
            System.out.println("level 2 Hurricane.");
        }
        else if(WS>=111 && WS<=130){
            System.out.println("level 3 Hurricane.");
        }
        else if(WS>=131 && WS<155){
            System.out.println("level 4 Hurricane.");
        }
        else{
            System.out.println("level 5 Hurricane.");
        }
    }
}
