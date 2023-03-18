import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args){
        int[][] A;
        int size,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Size of the Square Matrix: ");
        size =s.nextInt();
        A=new int[size][size];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                A[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<size;i++){
            sum+=A[i][i];
        }
        int j=size-1;
        for(int i=0;i<size;i++){
            sum+=A[i][j];
            j--;
        }
        System.out.println("The Sum of the diagonal elements of the matrix is: "+sum);
        s.close();
    }

}
