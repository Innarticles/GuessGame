import java.util.Random;
import java.util.Scanner;
public class GuessGame  {
	private int count;
<<<<<<< HEAD
	private int chances = 10;
	//private String cWord;
	private String[] cities = {"Lagos", "Accra"}; // "London", "Kumasi", "Jamiaca", "New York"};

	Random rn = new Random();
	int rdWord = rn.nextInt(2);
	String cWord = cities[rdWord];
	Scanner scan = new Scanner(System.in);
=======
	private String cWord;

	private String[] cities = {"Lagos", "Accra",  "London", "Kumasi", "Jamiaca", "New York"};
>>>>>>> 2f377692525d8c57d731e985a86bd0ed3d130369

	public GuessGame(String word)
	{
		cWord = word;
	}
	
	public GuessGame()
	{
<<<<<<< HEAD
		
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
		
=======
		int i =0;
		boolean right= false;
		while( i < cities.length)
		{
			if(w.equals(cities[i]))
			{
				right = true;
				break;
			}
			else
			{
				right = false;
			}
			i++;
		}
		return right;
>>>>>>> 2f377692525d8c57d731e985a86bd0ed3d130369
	}
	public boolean isGameOver()
	{
		if (count>10)
			{return false;}
		else
			{return true;}
	}
}