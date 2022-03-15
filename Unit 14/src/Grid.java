//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		
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
		int count2 = 0;
		String result = "";
		for (int i = 0; i < vals.length; i++) {
			count = 0;
			for (int k = 0; k < grid.length; k++) {
				for (int j = 0; j < grid[1].length; j++) {
				if (vals[i] == grid[k][j]) {
					count++;
				}
			}
			}
			
			if (count > count2) {
				count2 = count;
				result = vals[i];
			}
		}
		
		return result + " appears " + count2 + " times";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
	
			for (int k = 0; k < grid.length; k++) {
				for (int j = 0; j < grid[1].length; j++) {
				if (val == grid[k][j]) {
					count++;
				}
			}
			}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[1].length; j++) {
				output = output + " " + grid[i][j];
			}
			output = output + "\n";
		}
		return output;
	}
}