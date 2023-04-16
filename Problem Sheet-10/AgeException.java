import java.util.Scanner;

class TooOlder extends Exception{
    TooOlder(){
        super("TooOlder");
    }
}
class TooYounger extends Exception{
    TooYounger(){
        super("TooYounger");
    }
}

public class AgeException {
    public static void main(String[] args){
        int age;
        String name;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Name of the employee: ");
        name=s.next();
        System.out.println("Enter the Age of the Employee: ");
        age=s.nextInt();
        try{
            if(age>45){
                throw new TooOlder();
            }
            if(age<20){
                throw new TooYounger();
            }
            System.out.println(name+ " "+" is Eligible");
        }catch(TooOlder e){
            System.out.println(e);
        }catch(TooYounger e){
            System.out.println(e);
        }
    }
}
