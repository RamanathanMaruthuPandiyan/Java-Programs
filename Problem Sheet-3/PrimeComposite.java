import java.util.*;

public class PrimeComposite {
    public static void main(String[] args){
        int n,value;
        ArrayList<Integer> Prime=new ArrayList<>();
        ArrayList<Integer> Compo=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=s.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            value=s.nextInt();
            if(value==2||value==3||value==5||value==7||value==11){
                Prime.add(value);
            }
            else{
                for(int j=2;j<value/2;j++){
                    if(value%j==0){
                        Compo.add(value);
                        break;
                    }
                    else{
                        if(!Prime.contains(value) && j==(value/2)-1){
                            Prime.add(value);
                        }
                    }
                }
            }
        }
        System.out.println("The Prime numbers are: "+Prime);
        System.out.println("The Composite numbers are: "+Compo);
        s.close();
    }
}
