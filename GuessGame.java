public class GuessGame  {
	private int count;
	private String cWord;

	private String[] cities = {"Lagos", "Accra",  "London", "Kumasi", "Jamiaca", "New York"};

	public GuessGame(String word)
	{
		cWord = word;
	}
	
	public boolean isTheWord (String w)
	{
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
	}
	public boolean isGameOver()
	{
		if (count>10)
			{return false;}
		else
			{return true;}
	}
}