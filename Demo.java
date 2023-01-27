import java.util.Scanner;
import java.util.InputMismatchException;

public class Demo
{
	Scanner kb = new Scanner(System.in);
	String animal;
	Zoo z;
	System.out.println("Choose 1 or 2 to select an animal: ");
	try
	{
		animal = kb.nextLine();
	}
	catch(InputMismatchException e)
	{
		System.out.println("Please enter a number between 1 and 2.");
		animal = kb.nextLine();
	}

	if(kb == 1)
	{
		z = new Otter();		
	}
	else 
	{
		z = new Giraffe();
	}

	z.eat();
}
