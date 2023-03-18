import java.util.Scanner;

public class TrianglesThirdEdge {
    static int nextEdge(int S1,int S2){
        return (S1+S2)-1;
    }
    public static void main(String[] args){
        int S1,S2;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the First and Second Side of the Triangle(All Positive): ");
        S1=s.nextInt();
        S2=s.nextInt();
        System.out.println("The Maximum range of the Third Side of the Triangle: "+nextEdge(S1,S2));
    }

}
