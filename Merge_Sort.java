public class Merge_Sort {
    static void merge(int[]A,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for(int i=0;i<n1;++i){
            L[i]=A[low+i];
        }
        for(int j=0;j<n2;++j){
            R[j]=A[mid+1+j];
        }
        int i=0,j=0;
        int k=low;
        while(i<n1&&j<n2){
            if(L[i]<=R[j]){
                A[k]=L[i];
                i++;
            }
            else{
                A[k]=R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }
    static void mergesort(int[] A,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergesort(A, low, mid);
        mergesort(A, mid+1, high);
        merge(A,low,mid,high);
    }
    public static void main(String[] args){
        int[] A={100,200,97,56,95,23,45,67,93};
        int n=A.length;
        int low=0;
        int high=n-1;
        mergesort(A, low, high);
        for(int Num:A){
            System.out.println(Num+" ");
        }
    }
    
}