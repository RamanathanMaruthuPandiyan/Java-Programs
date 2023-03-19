import java.util.*;

public class Count_Sort {
    public static void main(String[] args){
        int[] A={1,4,6,1,2,4,7,4,6,7,4,3,2,8,9,6,7};
        int[] B;
        HashMap<Integer,Integer> count=new HashMap<>();
        int n=A.length;
        B=new int[n];
        for(int i=0;i<n;i++){
            if(count.containsKey(A[i])){
                count.put(A[i],count.get(A[i])+1);
            }
            else{
                count.put(A[i],1);
            }
        }
        int cum=0;
        for(Map.Entry<Integer,Integer> entry:count.entrySet()){
            cum+=entry.getValue();
            count.put(entry.getKey(),cum);
        }
        for(int j=0;j<n;j++){
            B[count.get(A[j])-1]=A[j];
            count.put(A[j],count.get(A[j])-1);
        }
        for(int j:B){
            System.out.println(j);
        }
    }
}