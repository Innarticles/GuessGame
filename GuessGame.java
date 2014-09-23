public class GuessGame  {

	private String cWord;
	private String[] = {"Lagos", "Accra",  "Lodon", "Kumasi", "Jamiaca", "New Yourk"};

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