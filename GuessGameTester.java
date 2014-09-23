import java.util.Scanner;
public class GuessGameTester
{

	public static void main(String args[])
	{
		//get input from user
		Scanner ggso = new Scanner(System.in);
		String gword  = so.nextLine();

		GuessGame ggo = new GuessGame(gword);

		Boolean isw = ggo.isTheWord(gword);

		 System.out.println(isw);
	}
}