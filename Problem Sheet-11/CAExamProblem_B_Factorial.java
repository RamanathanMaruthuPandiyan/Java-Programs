import java.util.Scanner;

class thread1 extends Thread{
    public void run(){
        System.out.println("Thread 1 is called.......");
    }
    public int fact(int n){
        if(n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}
class thread2 extends Thread{
    public void run(){
        System.out.println("Thread 2 is called....");
    }
    public void display(long [] factarray){
        for(int i=0;i<factarray.length;i++){
            long temp=factarray[i]%10;
            if(temp==0){
                System.out.print(factarray[i]+"\t");
            }
        }
    }
}

public class CAExamProblem_B_Factorial{
    public static void main(String[] args) throws InterruptedException{
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number till which the factorial have to be calculated: ");
        n=s.nextInt();
        thread1 t1=new thread1();
        long [] factarray=new long[n+1];
        for(int i=1;i<=n;i++){
            factarray[i]=t1.fact(i);
        }
        for(int i=0;i<=n;i++){
            System.out.println(factarray[i]);
        }
        thread2 t2=new thread2();
        t2.display(factarray);
        
    }
}
