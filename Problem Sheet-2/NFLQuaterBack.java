import java.util.Scanner;
public class NFLQuaterBack {
    static double PasserRating(int A,int B,int C,int D, int E){
        double W=(((double)A/(double)B)-0.3)*83.33;
        double X=(((double)C/(double)B)-3)*4.16;
        double Y=((double)D/(double)B)*333.33;
        double Z=(0.095-((double)E/(double)B))*416.66;
        double PasserRating=W+X+Y+Z;
        return (PasserRating<0)?0.0:PasserRating;
    }
    public static void main(String[] args){
        int A,B,C,D,E;
        Scanner s=new Scanner(System.in);
        if(args.length!=0){
            A=Integer.parseInt(args[0]);
            B=Integer.parseInt(args[1]);
            C=Integer.parseInt(args[2]);
            D=Integer.parseInt(args[3]);
            E=Integer.parseInt(args[4]);
        }
        else{
            System.out.println("Enter the value of A,B,C,D and E: ");
            A=s.nextInt();
            B=s.nextInt();
            C=s.nextInt();
            D=s.nextInt();
            E=s.nextInt();
        }
        System.out.println("The PasserRating is: "+String.format("%.2f",PasserRating(A, B, C, D, E)));
    }

}
