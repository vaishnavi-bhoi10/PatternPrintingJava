/* 
 1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
*/
package Pattern;
public class Pattern3 {
	public class NumberPatternSix {
		public static void main(String[] args) {
			int row = 6;
			//int column = 6;
			for (int i = 0; i < row; i++) // for row
			{
				for (int j = 0; j < i; j++) // for column
				{
					System.out.print(i + j);
					System.out.print("  ");
				}
				System.out.println(" ");
			}

		}
	}
}