/*	
55555
4444
333
22
1
*/
package Pattern;

public class Pattern5 {
	public static void main(String[] args) {
		int row = 5;
		int column = 5;
		for (int j = row; j > 0; j--) {
			for (int k = 0; k < column; k++) {
				System.out.print(j);
			}
			column--;
			System.out.println("");

		}
	}
}
