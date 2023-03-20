import java.util.Scanner;

public class Divisors {
    static int divisorsCount(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        System.out.println(divisorsCount(n));
    }
}
