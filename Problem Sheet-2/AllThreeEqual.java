import java.util.Scanner;

public class AllThreeEqual {
    public static void main(String[] args){
        int a,b,c;
        Scanner s=new Scanner(System.in);
        if(args.length!=0){
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            c=Integer.parseInt(args[2]);
        }
        else{
            System.out.println("Enter the Three Numbers: ");
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();
        }
        if(a==b && b==c){
            System.out.println("All the Three Inputs are Equal.");
        }else{
            System.out.println("Not Equal.");
        }
    }

}
