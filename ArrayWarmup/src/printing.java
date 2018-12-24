import java.util.Scanner;

public class printing{

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println();
				
		int [] order;
		order=new int[5];
		
		for(int i=0;i<order.length;i++)
		{
			System.out.println("Enter a Number :");
			int number=input.nextInt();
			order[i]=number;
		}
		
		
		
		System.out.println("=== Enter  Numbers are :====");
		for(int k=0;k < order.length;k++)
		{
			
			System.out.print(order[k]+" " );
			}
		}
	}
