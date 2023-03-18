import java.util.*;

public class WeightCal {
    void CalculateWeight(float H,String G){
        float Weight;
        if(G=="M"){
            Weight=106+(H-5)*12*7;
        }
        else{
            Weight=100+(H-5)*12*6;
        }
        System.out.println("You Should Weigh "+Weight+" pounds.");
    }
    public static void main(String[] args){
        float Height;
        String Gender;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Height(In Feet's): ");
        Height=s.nextFloat();
        System.out.print("Enter Gender(Male:M and Female:F): ");
        Gender=s.next();
        WeightCal obj=new WeightCal();
        obj.CalculateWeight(Height, Gender);
    }

}
