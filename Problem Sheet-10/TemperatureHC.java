import java.util.Scanner;

class TooHot extends Exception{
    TooHot(){
        super("Temperature is TooHot.");
    }
}
class TooCold extends Exception{
    TooCold(){
        super("Temperature is TooCold.");
    }
}

public class TemperatureHC {
    public static void main(String[] args){
        float temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Temperature in Celcius: ");
        temp=s.nextFloat();
        try{
            if(temp<0){
                throw new TooCold();
            }
            if(temp>35){
                throw new TooHot();
            }
            System.out.println("Temperature in(Celcius): "+temp);
            System.out.println("Temperature in (Fahrenheit): "+(temp*(9/5)+32));
        }catch(TooHot e){
            System.out.println(e);
        }catch(TooCold e){
            System.out.println(e);
        }
    }    
}
