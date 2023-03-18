import java.util.*;

public class HealthVisitor {
    static void countAvg(int[] Height,int NumBer){
        Arrays.sort(Height);
        HashMap<Integer,Integer> mp =new HashMap<>();
        float averAge=0;
        for(int i=0;i<NumBer;i++){
            if(mp.containsKey(Height[i])){
                mp.put(Height[i], mp.get(Height[i])+1);
            }
            else{
                mp.put(Height[i],1);
            }
        }
        System.out.println("Height"+"      "+"Number Of Pupils");
        for(HashMap.Entry<Integer,Integer> entry:mp.entrySet()){
            averAge+=(entry.getKey()*entry.getValue());
            System.out.println(entry.getKey()+"            "+entry.getValue());
        }
        System.out.println("The Average Height: "+averAge/NumBer);
    }
    public static void main(String[] args){
        int NumBer;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number of Students: ");
        NumBer=s.nextInt();
        int[] Height=new int[NumBer];
        System.out.println("Enter The Height of each Students (Centimeter): ");
        for(int i=0;i<NumBer;i++){
            Height[i]=s.nextInt();
        }
        countAvg(Height, NumBer);
    }

}
// 175 167 160 164 183 187 188 179 176 175 169 175 176 178 165 160 173 165 187 178