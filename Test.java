import java.util.Scanner;

public class Test
 {
 	public static void main( String args[] )
 	{
		Scanner s=new Scanner(System.in);
		String Choice;
		int A,B,Big=0;
		while(true){
			System.out.println("Enter Any Two Number: ");
			A=s.nextInt();
			B=s.nextInt();
			if(A==B){
				System.out.println("Numbers are equal.");
			}
			else{
				if(A>B){
					Big=A;
				}else{
					Big=B;
				}
				System.out.println("Biggest Number is: "+Big);
			}
			System.out.println("Do you want to continue(Y/N): ");
			Choice=s.next();
			if(Choice.equals("N") || Choice.equals("n")){
				break;
			}
		}
 	}
 }
