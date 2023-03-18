import java.util.*;
public class LuckyPerson {
    public static void main(String [] args){
        Random ran=new Random();
        ArrayList<String> LuckyName=new ArrayList<>();
        String value;
        int RanNumber;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter names for the lucky draw(enter \'quit\' to exit): ");
        while(true){
            value=s.next();
            if(value.equals("quit")){
                break;
            }else{
                if(!LuckyName.contains(value)){
                    LuckyName.add(value);
                }
            }
        }
        int n=LuckyName.size();
        RanNumber=ran.nextInt(n);
        System.out.println("The Contestants are: ");
        LuckyName.forEach((S)->{
            System.out.println(S);
        });
        System.out.println("The lucky person is: "+LuckyName.get(RanNumber));
    }
}
