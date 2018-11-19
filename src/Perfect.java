import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.println("Give me 10 numbers and I will tell you if they are perfect or not");
			int[] zenbakiak = new int[10];
			for (int i = 0; i < 10; i++) {
				System.out.println("Give me a number (" + (i + 1) + ")");
				boolean flag2 = true;
				while (flag2) {
					if (sc.hasNextInt()) {
						zenbakiak[i] = sc.nextInt();
						flag2 = false;
					} else {
						System.out.println("Enter a number please");
						sc.next();
					}
				}
				boolean flag3 = true;

				while (flag3) {
					int num = 0;
					for (int e = 0; e < i; e++) {
						if (zenbakiak[e] == zenbakiak[i]) {
							System.out.println("This number is already stored, give me another one");
							flag2 = true;
							while (flag2) {
								if (sc.hasNextInt()) {
									zenbakiak[i] = sc.nextInt();
									flag2 = false;
								} else {
									System.out.println("Enter a number please");
									sc.next();
								}
							}
							num = 1;
						}
					}
					if (num == 0) {
						flag3 = false;
					}
				}

			}

			for (int i = 0; i < zenbakiak.length; i++) {
				int sum = 0;
				for (int e = 1; e < zenbakiak[i]; e++) {
					if (zenbakiak[i] % e == 0) {
						sum = sum + e;
						
					}
				}
				
				if (sum == zenbakiak[i]) {
					System.out.println(zenbakiak[i]+" is perfect");
				} else {
					System.out.println(zenbakiak[i]+" isn't perfect");
				}
			}

			flag = false;
		}

	}

}
