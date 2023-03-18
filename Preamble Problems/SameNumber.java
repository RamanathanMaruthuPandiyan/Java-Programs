import java.util.Scanner;

public class SameNumber {
    static int isSameNum(int x,int y){
        if(x==y){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        int x,y,result;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        result=isSameNum(x,y);
        if(result==1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}