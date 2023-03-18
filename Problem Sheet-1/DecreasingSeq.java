import java.util.Scanner;

public class DecreasingSeq {
    public static void main(String[] args){
        int Num,count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        Num=s.nextInt();
        int[] A=new int[Num];
        for(int i=0;i<Num;i++){
            A[i]=s.nextInt();
        }
        for(int j=0;j<Num-1;j++){
            if(A[j]>A[j+1]){
                count++;
            }
        }
        if (count+1==Num){
            System.out.println("Decreasing");
        }
        else{
            System.out.println("Non-Decreasing");
        }
        s.close();
    }

}