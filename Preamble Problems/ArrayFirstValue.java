import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFirstValue {
    static int GetFirstValue(ArrayList<Integer> A){
        return A.get(0);
    }
    public static void main(String[] args){
        int n=1,element;
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> A=new ArrayList<>();
        while (n==1){
            element=s.nextInt();
            A.add(element);
            System.out.println("Enter 1 to enter and 0 to exit: ");
            n=s.nextInt();
            if(n==0){
                break;
            }
        }
        System.out.println("The Element at the index one is: "+GetFirstValue(A));
    }
}
