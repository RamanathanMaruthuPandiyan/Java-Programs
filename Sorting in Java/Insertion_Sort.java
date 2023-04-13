class Insertion_Sort{
    public static void main(String[] args){
        int[] A={100,200,97,56,95,23,45,67,93};
        int n=A.length,j;
        for(int i=1;i<n;i++){
            int temp=A[i];
            j=i;
            while(j>0 && A[j-1]>temp){
                A[j]=A[j-1];
                j--;
            }       
            A[j]=temp;     
        }
        for(int k:A){
            System.out.println(k+" ");
        }
    }
}