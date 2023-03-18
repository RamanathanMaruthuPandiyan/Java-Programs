import java.util.*;


public class AutoMorficNum {
    public static void main(String[] args){
        int n,count=0,m;
        int square;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number to check for Autotrophic or not: ");
        n=s.nextInt();
        square=n*n;
        m=n;
        while(n!=0){
            if(n%10==square%10){
                count+=1;
                n/=10;
                square/=10;
            }
            else{
                System.out.println("False");
                break;
            }
        }
        String S=Integer.toString(m);
        if(count==S.length()){
            System.out.println("True");
        }

    }
}
