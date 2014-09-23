public class GuessGame  {

	private String cWord;
	private String[] cities = {"Lagos", "Accra",  "London", "Kumasi", "Jamiaca", "New York"};

	public GuessGame(String word)
	{
		cWord = word;
	}
	
	public boolean istheWord (String w)
	{
		return cWord.equals(w);
	}
	public boolean isGameOver()
	{
		if (count>10)
			{return false;}
		else
			{return true;}
	}
}