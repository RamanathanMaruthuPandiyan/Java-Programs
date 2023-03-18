import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args){
        int[] A,B,C;
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array(Both the array size should be same: )");
        n=s.nextInt();
        A =new int[n];
        B =new int[n];
        C =new int[n];
        System.out.println("Enter the element of the First array: ");
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        System.out.println("Enter the element of the Second array: ");
        for(int i=0;i<n;i++){
            B[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            C[i]=A[i]+B[i];
        }
        System.out.println("The sum of the two arrays: ");
        for(int i:C){
            System.out.print(i+" ");
        }
        s.close();
    }

}
