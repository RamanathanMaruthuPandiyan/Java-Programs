import java.util.*;
class TenDifferentException{
    public static void main(String[] args){
        try{
            int a=10,b=0;
            int res=a/b;
            System.out.println("Result ="+res);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}