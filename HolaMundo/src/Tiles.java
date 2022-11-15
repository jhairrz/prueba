import java.util.Scanner;

public class Tiles {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Width of wall: ");
		double width = in.nextDouble();
		
		System.out.println("Title size: ");
		double titleSize = in.nextDouble();
		
		//TODO: Complete these computations
		int pairs = (int) (width - titleSize /(2 * titleSize));
		int redTiles = pairs;
		int WhiteTitles = pairs + 1;
		
		System.out.println("Red tiles: " + redTiles);
		System.out.println("Whites tiles: " + WhiteTitles);

	}

}
