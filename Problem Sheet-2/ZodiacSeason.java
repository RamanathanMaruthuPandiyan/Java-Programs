import java.util.Scanner;

public class ZodiacSeason {
    static String Zodiac(int M,int D){
        if((M==12 && D>=22 && D<=31)||(M==1 && D>=1 && D<=19)){
            return "CAPRICORN";
        }
        if((M==1 && D>=20 && D<=31)||(M==2 && D>=1 && D<=17)){
            return "AQUARIUS";
        }
        if((M==2 && D>=18 && D<=29)||(M==3 && D>=1 && D<=19)){
            return "PISCES";
        }
        if((M==3 && D>=20 && D<=31)||(M==4 && D>=1 && D<=19)){
            return "ARIES";
        }
        if((M==4 && D>=20 && D<=30)||(M==5 && D>=1 && D<=20)){
            return "TAURUS";
        }
        if((M==5 && D>=20 && D<=31)||(M==6 && D>=1 && D<=20)){
            return "GEMINI";
        }
        if((M==6 && D>=21 && D<=30)||(M==7 && D>=1 && D<=22)){
            return "CANCER";
        }
        if((M==7 && D>=23 && D<=31)||(M==8 && D>=1 && D<=22)){
            return "LEO";
        }
        if((M==8 && D>=23 && D<=31)||(M==9 && D>=1 && D<=22)){
            return "VIRGO";
        }
        if((M==9 && D>=23 && D<=30)||(M==10 && D>=1 && D<=22)){
            return "LIBRA";
        }
        if((M==10 && D>=23 && D<=31)||(M==11 && D>=1 && D<=21)){
            return "SCORPIO";
        }
        if((M==11 && D>=22 && D<=30)||(M==12 && D>=1 && D<=21)){
            return "SAGITTARIUS";
        }
        return "Sorry! Wrong Date.";
    }
    static String Seasons(int M,int D){
        if((M==3 && D>=21 && D<=31)||(M==4 && D>=1 && D<=30)||(M==5 && D>=1 && D<=31)||(M==6 && D>=1 && D<=20)){
            return "SPRING";
        }
        if((M==6 && D>=21 && D<=30)||(M==7 && D>=1 && D<=31)||(M==8 && D>=1 && D<=31)||(M==9 && D>=1 && D<=22))
        {
            return "SUMMER";
        }
        if((M==9 && D>=23 && D<=30)||(M==10 && D>=1 && D<=31)||(M==11 && D>=1 && D<=30)||(M==12 && D>=1 && D<=21))
        {
            return "FALL";
        }
        if((M==9 && D>=21 && D<=31)||(M==1 && D>=1 && D<=31)||(M==2 && D>=1 && D<=29)||(M==3 && D>=1 && D<=20)){
            return "WINTER";
        }
        return "Sorry! Wrong Date.";
    }
    public static void main(String[] args){
        int Month,Day;
        Scanner s=new Scanner(System.in);
        if(args.length!=0){
            Month=Integer.parseInt(args[0]);
            Day=Integer.parseInt(args[1]);
        }else{
            System.out.println("Please enter Month and Day.");
            Month=s.nextInt();
            Day=s.nextInt();
        }
        System.out.println("The Season is : "+Seasons(Month, Day));
        System.out.println("The Zodiac Sign for the Date is: "+Zodiac(Month, Day));
    }
}
