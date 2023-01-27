import java.util.Scanner;
import java.util.InputMismatchException;

public class Demo
{
   public static void main(String[] args)
   {
	Scanner kb = new Scanner(System.in);
	int animal;
	Zoo z;
	System.out.println("Choose 1 or 2 to select an animal: ");
	try
	{
		animal = kb.nextInt();
	}
	catch(InputMismatchException e)
	{
		System.out.println("Please enter a number between 1 and 2.");
		animal = kb.nextInt();
	}

	if(animal == 1)
	{
		z = new Otter();		
	}
	else 
	{
		z = new Giraffe();
	}

	z.eat();
   }
}
