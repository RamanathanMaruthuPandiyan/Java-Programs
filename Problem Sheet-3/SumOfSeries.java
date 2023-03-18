import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args){
        int n,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value: ");
        n=s.nextInt();
        int j=n;
        for(int i=1;i<=n;i++){
            sum+=i*j;
            j--;
        }
        System.out.println("The Sum of the Series up to Value "+n+" = "+sum);
        s.close();
    }
}
