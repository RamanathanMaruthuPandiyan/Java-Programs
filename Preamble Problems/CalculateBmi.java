import java.util.Scanner;

public class CalculateBmi {
    static String BMI(double weight,double height,String gender){
        double bmi;
        bmi=weight/Math.pow(height,2);
        if(bmi>=27.8 && (!(gender=="M") || !(gender=="m"))){
            return "Obese";
        }
        else if(bmi>=25 && (!(gender=="F") || !(gender=="f"))){
            return "Obese";
        }
        else{
            return "Healthy";
        }
    }
    public static void main(String[] args){
        double weight,height;
        String gender;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Weight,Height(in Meters) and Gender(M for Male and F for Female): ");
        weight=s.nextDouble();
        height=s.nextDouble();
        gender=s.next();
        System.out.println("You are "+BMI(weight, height, gender));
    }
}
