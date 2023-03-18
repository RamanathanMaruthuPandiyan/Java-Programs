import java.util.*;

class DateToDay{
    static HashMap<Integer,String> Days=new HashMap<>();
    static HashMap<Integer,Integer> MonTh=new HashMap<>();
    String FindDay(int Month, int Day,int Year){
        int K,M,D,C,F,R=0;
        D=Year%100;
        C=Year/100;
        K=Day;
        M=MonTh.get(Month);
        F=K+((13*M-1)/5)+D+(D/4)+(C/4)-2*C;
        if(F<0){
            R+=(F%7)+7;
        }
        else{
            R=F%7;
        }

        return Days.get(R);

    }
    public static void main(String[] args){
        int Day,Month,Year;
        Scanner s=new Scanner(System.in);
        if(args.length!=0){
            Month=Integer.parseInt(args[0]);
            Day=Integer.parseInt(args[1]);
            Year=Integer.parseInt(args[2]);
        }
        else{
            System.out.println("Enter the Date space separated month,day and year respectively in formate: ");
            Month=s.nextInt();
            Day=s.nextInt();
            Year=s.nextInt();
        }
        Days.put(0,"SUNDAY");
        Days.put(1,"MONDAY");
        Days.put(2,"TUESDAY");
        Days.put(3,"WEDNESDAY");
        Days.put(4,"THURSDAY");
        Days.put(5,"FRIDAY");
        Days.put(6,"SATURDAY");
        MonTh.put(1,11);
        MonTh.put(2,12);
        MonTh.put(3,1);
        MonTh.put(4,2);
        MonTh.put(5,3);
        MonTh.put(6,4);
        MonTh.put(7,5);
        MonTh.put(8,6);
        MonTh.put(9,7);
        MonTh.put(10,8);
        MonTh.put(11,9);
        MonTh.put(12,10);
        DateToDay obj=new DateToDay();
        System.out.println("The Day is for the Date "+Month+"/"+Day+"/"+Year+": "+obj.FindDay(Month, Day, Year));
    }
}