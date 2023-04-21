public class Test
 {
 	

 	public static void main( String args[] )
 	{
		String A="geeksforgeeks";
		String B="geeksquiz";
		int [] arr1=new int[26];
		int [] arr2=new int[26];
		for(char x:A.toCharArray()){
			arr1[x -'a']++;
		}
		for(char x:B.toCharArray()){
			arr2[x-'a']++;
		}
		for(int i:arr1){
			System.out.println(i);
		}
		
 	}
 }
