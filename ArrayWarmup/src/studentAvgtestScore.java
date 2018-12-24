import java.util.Scanner;

public class studentAvgtestScore {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println("Enter Total Student Number :");
		int student_number=input.nextInt();
		// TODO Auto-generated method stub
		int  [] scores; // declaring a  variable called marks of the array type, which each element of type int.
		// creating new object of Array  and allocating contiguous memory for holding  but 
		//in this case i  haven´t holding any memory location because i am taking user Input 
		scores= new int [student_number] ;
		
		try{ // using try and catch method
			
	
			
		for(int i=0;i<student_number;i++) // loop run  until the give number of student  and  getting user input 
		{
			System.out.println("Enter  student's Marks: ");
			int marks=input.nextInt();
			scores[i]=marks;
			
		}
		
				

		}
		
		catch(Exception e)
		{
			System.out.println("invalid input!!");
		}
		double sum=0.0;// sum variable but type of double  because AVG score can be in decimal format so easy to conversion int to double 
		for (int i=0;i<scores.length;i++) //  this loop for the display  scores array elements.
		{
			sum+=scores[i];
		
		}
		System.out.println("==================================");
		System.out.println( "Student's  Avrage Score is : "+ sum/student_number);	
	}

}
