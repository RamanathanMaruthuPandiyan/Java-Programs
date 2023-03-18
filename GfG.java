//{ Driver Code Starts
    import java.util.*;
    import java.io.*;
    import java.lang.*;

    public class GfG {
        public static void main (String[] args){
            Scanner s=new Scanner(System.in);
            int n,k;
            n=s.nextInt();
            int[] a=new int[n];
            k=s.nextInt();
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
            firstElementKTime(a, n, k);
        }
        static void firstElementKTime(int[] a, int n, int k) {
            HashMap<Integer,Integer> HP=new HashMap<>();
            for(int i=0;i<n;i++){
                if(HP.containsKey(a[i])){
                    HP.put(a[i],HP.get(a[i])+1);
                }
                else{
                    HP.put(a[i],0);
                }
            }
            for(HashMap.Entry<Integer,Integer> entry:HP.entrySet()){
                System.out.println(entry.getKey()+"            "+entry.getValue());
            }
            for (HashMap.Entry<Integer, Integer> entry : HP.entrySet()) {
                if (entry.getValue()==k) {
                    System.out.println(entry.getKey());
                    break;
                }
            }
            System.out.println("-1");
        }
    }