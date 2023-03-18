import java.util.*;
public class PasswordGenerate {
    public static void main(String[] args){
        int len;
        int ULet,LLet,Num,Sym;
        String Upper="ZAXQSCWDVEFBRGNTHMYJUKILOP";
        String Lower="qawsedrftgyhujikolpzxcvbnm";
        String SpecialChars="!@#$<>/?.!&()~^";
        String Numbers="1234567890";
        String ComBinate="";
        Random ran=new Random();
        Scanner s=new Scanner(System.in);
        do{
            System.out.println("Enter the Length of the Password u want to generate (B/w the 8-16):");
            len=s.nextInt();
        }while(len<8 || len>16);
        System.out.print("Do you want to use Uppercase(Enter 1 for Yes and 0 for No):");
        ULet=s.nextInt();
        System.out.print("Do you want to use Lowercase(Enter 1 for Yes and 0 for No):");
        LLet=s.nextInt();
        System.out.print("Do you want to use Numbers(Enter 1 for Yes and 0 for No):");
        Num=s.nextInt();
        System.out.print("Do you want to use Symbols(Enter 1 for Yes and 0 for No):");
        Sym=s.nextInt();
        if(ULet==1){
            ComBinate+=Upper;
        }
        if(LLet==1){
            ComBinate+=Lower;
        }
        if(Num==1){
            ComBinate+=Numbers;
        }
        if(Sym==1){
            ComBinate=SpecialChars+ComBinate;
        }
        char[] Password=new char[len];
        if(ComBinate.length()!=0){
            for(int i=0;i<len;i++){
                Password[i]=ComBinate.charAt(ran.nextInt(ComBinate.length()));
            }
            System.out.println("The Randomly generated Password is: "+String.valueOf(Password));
        }else{
            System.out.println("Sorry! You have given No to all the conditions we can\'t generate password.");
        }
    }
}
