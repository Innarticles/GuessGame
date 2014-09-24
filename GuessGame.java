import java.util.Random;
import java.util.Scanner;
public class GuessGame  {
	private int count;
	private int chances = 10;
	//private String cWord;
	private String[] cities = {"Lagos", "Accra"}; // "London", "Kumasi", "Jamiaca", "New York"};

	Random rn = new Random();
	int rdWord = rn.nextInt(2);
	String cWord = cities[rdWord];
	Scanner scan = new Scanner(System.in);

	public GuessGame(String word)
	{
		cWord = word;
	}
	
	public GuessGame()
	{
		
	}

	public boolean isTheWord (String w)
	{	
		int i = 0;
		boolean r =false;
		while (i < chances)
		{
			if (cWord.equals(w))
				{
					r = true;
					System.out.println("Aha! I told you can be lucky");
					break;
				}
			else
				{	System.out.println("You have " + (chances - i) + " trials left");
					System.out.println(" ");
					System.out.print("Wrong! Try again :");
					w = scan.nextLine();
					r = false;
				}
			i++;
		}
		return r;
		
	}
	public boolean isGameOver()
	{
		if (count>10)
			{return false;}
		else
			{return true;}
	}
}