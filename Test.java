public class Test {
    public static void main(String[] args){
        System.out.println(mystery(6));
    }
    public static int mystery(int n){
        int result;
        if(n>1){
            result=2*n-1+mystery(n-1);
            System.out.println(n+" : "+result);
        }
        else{
            result=1;
            System.out.println(n+" : "+result);
        }
        return result;
    }
}
