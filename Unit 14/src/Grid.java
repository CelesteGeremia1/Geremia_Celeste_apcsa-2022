//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				int k = (int)(Math.random() * vals.length);
				grid[i][j] = vals[k];
			}
			
		}
		
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int count = 0;
		for (int i = 0; i < grid[1].length; i++) {
			for (int j = 0; j < vals.length; j++) {
				
			}
		}
		
		return "nothing yet";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		return 0;
	}

	//display the grid
	public String toString()
	{
		String output="";
		return output;
	}
}