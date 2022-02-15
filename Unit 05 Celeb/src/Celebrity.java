/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	private String celebClue;
	private String celebAnswer;
	
	/**
	 * The answer or name of the celebrity.
	 */
	
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity()
	{
		
	}
	public Celebrity(String answer, String clue)
	{
		
	}

	public String getClue()
	{
		return celebClue;
	}

	public String getAnswer()
	{
		return celebAnswer;
	}

	public void setClue(String clue)
	{
		celebClue = clue;
	}
	
	public void setAnswer(String answer)
	{
		celebAnswer = answer;
	}
	
	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		return null;
	}
	
}
