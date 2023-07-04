    public class Selection_Sort {
        public static void main(String[] args){
            int[] A={100,200,97,56,95,23,45,67,93};
            int minindex=0,n=A.length;
            for(int i=0;i<n;i++){
                minindex=i;
                for(int j=i+1;j<n;j++){
                    if(A[j]<A[minindex]){
                        minindex=j;
                    }
                    int temp=A[i];
                    A[i]=A[minindex];
                    A[minindex]=temp;
                }
            }
            for(int k:A){
                System.out.println(k+" ");
            }
        }
    }
