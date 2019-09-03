package reverse;

import java.util.Scanner;

public class Reverse {
	static int number;
	
	public static void main(String[] args)
	{
		System.out.println("Enter number to reverse or q to quit: ");
		Scanner input = new Scanner(System.in);
		
		String line = input.next();
		while(!line.equals("q"))
		{
			if(line.matches("\\d+"))
			{
				number = Integer.parseInt(line);
				System.out.println("The reverse of : " + number + " is : " + reverse(number));
			}



			System.out.println("Enter number to reverse or q to quit: ");
			line = input.next();
		}
		System.out.println("Goodbye!!!!");
	}
	
	
	public static int reverse(int aNumber)
	{
		int reversed = 0;
		while(aNumber != 0) {
			 reversed = reversed * 10;
	          reversed = reversed + aNumber%10;
	          aNumber = aNumber/10;
        }
		return reversed;
		
	}
	
	
	
	

}
