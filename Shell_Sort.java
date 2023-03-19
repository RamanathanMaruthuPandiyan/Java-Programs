public class Shell_Sort {
    public static void main(String[] args){
        int[] A={100,200,97,56,95,23,45,67,93};
        int n=A.length,j;
        for(int gap=n/2;gap>0;gap/=2){
            for(int i=gap;i<n;i++){
                int temp=A[i];
                j=i;
                while(j>=gap&&temp<A[j-1]){
                    A[j]=A[j-gap];
                    j-=gap;
                }
                A[j]=temp;
            }
        }
        for(int k:A){
            System.out.println(k+" ");
        }
    }
}
