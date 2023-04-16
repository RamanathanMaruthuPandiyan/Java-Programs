import java.util.Scanner;

interface Exam{
    void percent_calc();
}

class Students{
    String Name;
    int Roll_No;
    int Marks_1,Marks_2;
    void input(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Student Name: ");
        Name=s.next();
        System.out.print("Enter the Roll No of the student: ");
        Roll_No=s.nextInt();
        System.out.print("Enter the marks of the first and second subject respectively out of 100: ");
        Marks_1=s.nextInt();
        Marks_2=s.nextInt();
    }
    void show(){
        System.out.println("Student Name: "+Name);
        System.out.println("Student Roll No: "+Roll_No);
        System.out.println("Marks of the fist subject: "+Marks_1);
        System.out.println("Marks of the second subject: "+Marks_2);
    }
}
class  Result extends Students implements Exam{

    @Override
    public void percent_calc() {
        int sum=Marks_1+Marks_2;
        System.out.println("The Percentage: "+((double)sum/200)*100);
    }
}

public class InterfaceAndClass {

    public static void main(String[] args){
        Result R=new Result();
        R.input();
        R.show();
        R.percent_calc();
    }
    
}
