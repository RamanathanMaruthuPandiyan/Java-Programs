import java.util.*;

public class PrintTheEleAtPosition {
    public static void main(String[] args){
        int[] A;
        int n,p;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n=s.nextInt();
        A=new int[n];
        System.out.println("Enter  the array elements: ");
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        Arrays.sort(A);
        System.out.println("Array After sorting: ");
        for(int i:A){
            System.out.print(i+" ");
        }
        System.out.println("\nEnter the position: ");
        p=s.nextInt();
        System.out.println("The Element at index \'"+p+"\' is: "+A[p]);
        s.close();
    }
}
