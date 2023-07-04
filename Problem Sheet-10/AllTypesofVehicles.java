public class AllTypesofVehicles {
    public static void main(String[]args){
        Vehicle V1=new TwoWheeler(11, "bike", 10389534, "Drop Bars");
        Vehicle V2=new FourWheeler(12, "Car", 381291894, "Power Steering");
        V1.display();
        V2.display();
    }
    
}

abstract class Vehicle{
    int ID;
    String NAME;
    long LN;
    Vehicle(int id,String name,long lisence_Number){
        ID=id;
        NAME=name;
        LN=lisence_Number;
    }

    abstract void display();
}
class TwoWheeler extends Vehicle{
    String Shandler;
    
    TwoWheeler(int id,String name,long lisence_Number,String SH){
        super(id,name,lisence_Number);
        Shandler=SH;

    }
    @Override
    void display(){
        System.out.println("The Id number of the vehicle: "+ID);
        System.out.println("The Name of the vehicle: "+NAME);
        System.out.println("The Lisence Number is: "+LN);
        System.out.println("The Stering Handler is : "+Shandler);
    }


}
class FourWheeler extends Vehicle{
    String SWheeler;

    FourWheeler(int id,String name,long lisence_Number,String SW){
        super(id,name,lisence_Number);
        SWheeler=SW;
    }

    @Override
    void display(){
        System.out.println("The Id number of the vehicle: "+ID);
        System.out.println("The Name of the vehicle: "+NAME);
        System.out.println("The Lisence Number is: "+LN);
        System.out.println("The Stering Handler is : "+SWheeler);
    }
}

