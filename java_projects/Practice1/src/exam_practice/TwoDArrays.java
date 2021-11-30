/**
 * 
 */
package exam_practice;

/**
 * @author Bruce
 *
 */
import java.util.Scanner;
public class TwoDArrays {
	private String[][] carsArr = new String[3][5];
	
	public void populate() {
		Scanner scanner =  new Scanner(System.in);

		for(int i=0; i <carsArr.length; i++) {
			System.out.println("Please enter Row "+(i+1)+" cars: ");
			for(int j=0; j<carsArr[i].length; j++) {
				System.out.print("Enter Car "+(j+1)+":");
					carsArr[i][j] = scanner.nextLine();
			}
		}
	}
	
	public void Display() {
		for (int i = 0; i < carsArr.length; i++) {
			System.out.println("ROW "+(i+1)+" : ");
			for (int j = 0; j < carsArr[i].length; j++) {
				System.out.print(carsArr[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		TwoDArrays twoDArrays = new TwoDArrays();
		twoDArrays.populate();
		twoDArrays.Display();
	}

}
