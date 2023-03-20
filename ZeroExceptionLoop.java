import java.util.*;

public class ZeroExceptionLoop{
    public static void main(String[] args){
        int n, i=0, sum=0, k=0, j;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the No of Elements : ");
        n = in.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            System.out.print("Number : ");
            arr[i] = in.nextInt();
        }

        for(k=0;k<n;k++){
            try{
                if(arr[k]==0){
                    throw new Exception();
                }
                else{
                    sum += arr[k];
                }
            }
            catch(Exception E){
              System.out.println("Zero Element Found at : "+k);
            }
        }
     
        System.out.println("Sum of all Elements : "+sum);
        in.close();
    }
}