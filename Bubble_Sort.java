public class Bubble_Sort {
    public static void main(String [] agrs){
        int[] A={100,200,97,56,95,23,45,67,93};
        int flag=1,n=A.length;
        for(int i=0;i<n && flag==1;i++){
            flag=0;
            for(int j=1;j<n-i;j++){
                if(A[j-1]>A[j]){
                    int temp=A[j-1];
                    A[j-1]=A[j];
                    A[j]=temp;
                    flag=1;
                }
            }
        }
        for(int k:A){
            System.out.println(k+" ");
        }
    }
}
