import java.util.*;

public class RepeatedElements {
    public static void main(String[] args){
        int n,count=0,value;
        HashMap<Integer,Integer> Ele=new HashMap<Integer,Integer>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n=s.nextInt();
        System.out.println("Enter the elements: ");
        while(n!=0){
            value=s.nextInt();
            if(Ele.containsKey(value)){
                Ele.put(value,Ele.get(value)+1);
            }
            else{
                Ele.put(value, 1);
            }
            n--;
        }
        System.out.print("Repeated elements are: ");
        for(Integer key:Ele.keySet()){
            if(Ele.get(key)>1){
                count++;
                System.out.print(key+" ");
            }
        }
        System.out.println("\nTotal repeated elements : "+count);
        s.close();
    }
}
