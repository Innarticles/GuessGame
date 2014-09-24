import java.util.Scanner;
public class GuessGameTester
{
public static void main(String args[])
{
//get input from user
		System.out.println("Welcome to aYoInno Mind game!");
		System.out.println("Simply think of a city in the world. You might just be lucky");
		System.out.println("");
		System.out.print("Guess a city: ");

		Scanner ggso = new Scanner(System.in);
		String gword = ggso.nextLine();
		GuessGame ggo = new GuessGame();
		Boolean isw = ggo.isTheWord(gword);
		if (isw == false)
			{
				System.out.println("Hey! - I thought you are smart");
			}
		}
}