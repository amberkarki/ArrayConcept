
public class SumofPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number={1,2,-9,-20,15,150,144,80,-88,-100};//  an array with -ve and +ve value only i am taking sum of +ve. 
		
		int positiveSum=0;//  positive sum variable 
		String  negatveSum =""; // this string variable  will store negative number of array and will print later on this program.
		for(int i =0;i<number.length;i++)//number.length  .length  which is size of array or length of array 
		{
			if(number[i]>0) // if statement to check an Array element is positive or not !!
			{
				positiveSum+=number[i]; // adding  array element if  it is positive
			}
			else 
			{
				
				negatveSum+=number[i] + " "; // this string will be final out put   of negative value of array .
			}
			}
		System.out.println(" Sum of Positive Number is : "+ positiveSum);
		System.out.println(" And Negative Numbers are  : "+ negatveSum);
		}

	}


