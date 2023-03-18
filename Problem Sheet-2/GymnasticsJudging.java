import java.util.*;

public class GymnasticsJudging {
    public static void main(String[] args){
        float[] Marks=new float[6] ;
        float sum=0;
        int j=0;
        Scanner s=new Scanner(System.in);
        if(args.length!=0){
            for(String i:args){
                Marks[j]=Float.parseFloat(i);
            }
        }else{
            System.out.println("Enter the Marks of the 6 judges(in Scale of 0.0-10.0): ");
            for(int i=0;i<6;i++){
                Marks[i]=s.nextFloat();
            }
        }
        Arrays.sort(Marks);
        for(int i=1;i<=4;i++){
            sum+=Marks[i];
        }
        System.out.println("The Average by Throwing low and high scores: "+sum/4);
    }
}
