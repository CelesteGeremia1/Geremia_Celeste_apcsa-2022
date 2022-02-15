import static java.lang.System.out;

import java.util.Scanner;

/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter the clue :: ");
		String clue = keyboard.nextLine();
		out.print("Enter the answer :: ");
		String answer = keyboard.nextLine();
		
		Celebrity test = new Celebrity();
		test.setAnswer(answer);
		test.setClue(clue);
		
	}
}
