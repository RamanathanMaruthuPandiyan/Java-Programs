import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PassWordVerification {
    public static void main(String[] args){
        String s;
        boolean Upper=false,Lower=false,Numbers=false,Symbols=false;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Password for checking the strangeness of it: ");
        s=scan.next();
        Set<Character> set=new HashSet<Character>(Arrays.asList('!','@','#','$','^','(',')','*','+','-','&'));
        if(s.length()>=8 && s.length()<=16){
            for(char i:s.toCharArray()){
                if(Character.isUpperCase(i)){
                    Upper=true;
                }
                if(Character.isLowerCase(i)){
                    Lower=true;
                }
                if(Character.isDigit(i)){
                    Numbers=true;
                }
                if(set.contains(i)){
                    Symbols=true;
                }
            }
            System.out.print("Strength of the password is: ");
            if(Upper||Lower||Numbers||Symbols){
                System.out.println("Great Password");
            }
            else if(Lower||Numbers||Symbols){
                System.out.println("Good");
            }
            else if(Upper||Lower||Numbers){
                System.out.println("Medium");
            }
            else{
                System.out.println("Weak");
            }
        }
        else{
            System.out.println("Sorry! The password length must be greater than or equal to 8 or less or equal to 16.");
        }
        System.out.println("\n**Avoid using the same password twice,\nAvoid character repetition,\nkeyboard patterns,\ndictionary words,\nletter or number sequences.**");
    }
}
