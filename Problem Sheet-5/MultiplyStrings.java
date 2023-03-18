import java.util.*;
public class MultiplyStrings {
    static void ManyString(ArrayList<String> StringList,int k){
        ArrayList<String> MulList=new ArrayList<>();
        for(int i=0;i<StringList.size();i++){
            for(int j=0;j<k;j++){
                MulList.add(StringList.get(i));
            }
        }
        System.out.println(MulList);
    }

    public static void main(String[] args){
        ArrayList<String> StingList=new ArrayList<>();
        String value;
        int key;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the strings(enter \'quit\' to exit'): ");
        while(true){
            value=s.nextLine();
            if(value.equals("quit")){
                break;
            }
            else{
                StingList.add(value);
            }
        }
        System.out.println("Enter the key for multiplying the string: ");
        key=s.nextInt();
        ManyString(StingList,key);
    }

}
