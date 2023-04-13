abstract class Asset{
    String descriptor;
    String date;
    int cur_value;
    abstract void displayDetails();
}
class Stock extends Asset{
    int interest_rate;
    int share_price;

    Stock (String d,String da,int cv,int ir,int sp){
        descriptor=d;
        date=da;
        cur_value=cv;
        interest_rate=ir;
        share_price=sp;
    }
    @Override
    void displayDetails(){
        System.out.println("Stock Class:");
        System.out.println("Descriptor: "+descriptor);
        System.out.println("Date: "+date);
        System.out.println("Curent Value: "+cur_value);
        System.out.println("Interest Rate: "+interest_rate);
        System.out.println("Share Price: "+share_price);
    }
}
class Bond extends Asset{
    int interest_rate;

    Bond (String d,String da,int cv,int ir){
        descriptor=d;
        date=da;
        cur_value=cv;
        interest_rate=ir;
    }
    @Override
    void displayDetails(){
        System.out.println("Bond Class:");
        System.out.println("Descriptor: "+descriptor);
        System.out.println("Date: "+date);
        System.out.println("Curent Value: "+cur_value);
        System.out.println("Interest Rate: "+interest_rate);
    }
}
class Savings extends Asset{
    int interest_rate;

    Savings (String d,String da,int cv,int ir){
        descriptor=d;
        date=da;
        cur_value=cv;
        interest_rate=ir;
    }
    @Override
    void displayDetails(){
        System.out.println("Savings Class:");
        System.out.println("Descriptor: "+descriptor);
        System.out.println("Date: "+date);
        System.out.println("Curent Value: "+cur_value);
        System.out.println("Interest Rate: "+interest_rate);
    }
}

public class assetDetails {
    public static void main(String[] args){
        Asset A1=new Stock("Asset Papers", "11/04/23", 12, 20, 10000);
        Asset A2=new Bond("Bond papers", "11/04/23", 10, 13);
        Asset A3=new Savings("Savings", "11/04/23", 11, 12);
        A1.displayDetails();
        A2.displayDetails();
        A3.displayDetails();
    }
}
