import java.util.Scanner;

public class MainDriver 
{

	public static void main(String[] args) 
	{
		var scanner = new Scanner(System.in);
		
		var num1 = Math.round(Math.random() * 10000);
		var win = true;
		var min = 1;
		var max = 10000;
		
		while (win == true)
		{
			System.out.println("The range is: " + min + " to " + max);
			System.out.print("Enter a number: ");
			var usernum = scanner.nextInt();
			
			var runner = new Runner();
			switch (runner.Guess(usernum, (int) num1, (int) max, (int) min))
			{
			case -1:
				System.out.println("LOWER.");
				max = usernum - 1;
				break;
				
			case 0:
				System.out.println("WINNER.");
				win = false;
				break;
				
			case 1:
				System.out.println("HIGHER.");
				min = usernum + 1;
				break;
				
			case -2:
				System.out.println("Number is lower than range.");
				break;
				
			case 2:
				System.out.println("Number is higher than range.");
				break;
			}
		}
		scanner.close();
	}

}
