import java.util.Scanner;

class bill{
    Scanner sc=new Scanner(System.in);
    int Reference_num;
    void input(){
        System.out.println("Enter the Reference_num: ");
        Reference_num=sc.nextInt();
    }
    void display(){
        System.out.println("The Reference_Num: "+Reference_num);
    }
}
class Electricity_Bill extends bill{
    float units,per_unit_price,tax;
    float total_amount;
    @Override
    void input(){
        super.input();
        System.out.println("Enter the Units consumed: ");
        units=sc.nextFloat();
        System.out.println("Enter the Per_Unit_Price: ");
        per_unit_price=sc.nextFloat();
        System.out.println("Enter the Tax Amount: ");
        tax=sc.nextFloat();
        total_amount=(per_unit_price*units)-tax;
    }
    @Override
    void display(){
        super.display();
        System.out.println("The Units Consumed: "+units);
        System.out.println("The Per_Unit_Price: "+per_unit_price);
        System.out.println("The Tax: "+tax);
        System.out.println("The Total_Amount: "+total_amount);
    }

}
class Water_Bill extends bill{
    
}

public class ElectriCityBill {
    public static void main(String[] args){
        bill b=new Electricity_Bill();
        b.input();
        b.display();
    }    
}
