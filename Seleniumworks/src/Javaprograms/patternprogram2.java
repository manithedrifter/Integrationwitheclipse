package Javaprograms;

public class patternprogram2 {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5 - i; j >= 1; j--) {
				System.out.print("");
			}
			for (int j = 5; j >= 1; j--) {
				if ((i == 4 && j == 1)||(i==2&&j==1)||(i==2&&j==1)) {
					System.out.print("");
				} else if ((i == 3 && j == 2) || (i == 2 && j == 2)||(i == 2 && j == 2)) {
					System.out.print(" ");
				} else if ((i == 2 && j == 3) || (i == 3 && j == 2) || (i == 3 && j == 1)) {
					System.out.print(" ");
				} else if(i==1&&j==4)
				{
					break;
				}
				else
					System.out.print(j);

			}
			for (int j = 1; j <= 5; j++) {
				if (i == 4 && j == 1) {
					System.out.print("  ");
				} else if ((i == 3 && j ==2) || (i == 3 && j == 1)||(i == 2 && j == 1)) {
					System.out.print(" ");
				} else if ((i == 2 && j == 3) || (i == 3 && j == 2) ||(i == 2 && j == 2) ) {
					System.out.print(" ");
				}
				else if (j<=5&&i==1)
				{
					if(j==5)
					{
					System.out.print("        "+j);
					break;
					}
				}
				else
					
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
