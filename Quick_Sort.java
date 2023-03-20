public class Quick_Sort{
    static void Swap(int[] A,int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    static int Partition(int[] A,int low,int high){
        int pivot=A[high];
        int i=(low-1);
        for(int j=low;j<=high-1;j++){
            if(A[j]<pivot){
                i++;
                Swap(A, i, j);
            }
        }
        Swap(A, i+1,high);
        return (i+1);
    }
    static void QuickSort(int[] A,int low,int high){
        if(low<high){
            int loc=Partition(A,low,high);
            QuickSort(A, low, loc-1);
            QuickSort(A, loc+1, high);
        }
    }
    public static void main(String[] args){
        int[] A={100,200,97,56,95,23,45,67,93};
        int n=A.length;
        int low=0;
        int high=n-1;
        QuickSort(A,low,high);
        for(int Num:A){
            System.out.println(Num+" ");
        }
    }
}