import java.util.Scanner;

class CheckArgumentexception extends Exception{
    CheckArgumentexception(String s){
        super(s);
    }
}

public class ArgumentException {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n=s.nextInt();
        try{
            if(n<5){
                throw new CheckArgumentexception("n is less than 5");
            }
            else{
                int sum=0;
                System.out.println("Enter "+n+" numbers");
                int A[]=new int[n];
                for(int i=0;i<n;i++){
                    A[i]=s.nextInt();
                }
                for(int i:A){
                    sum+=i;
                }
                System.out.println("The Sum : "+sum);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }   
}
