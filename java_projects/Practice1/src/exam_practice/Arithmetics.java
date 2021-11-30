package exam_practice;

import java.util.Random;
import java.util.Scanner;

public class Arithmetics {

	public void hypotenuse() {
		double sideA, sideB, sideC;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Side A:");
		sideA = scanner.nextDouble();
		System.out.println("Enter Side B:");
		sideB = scanner.nextDouble();

		sideC = Math.sqrt((sideA * sideA) + (sideB * sideB));
		System.out.println("Hypotenuse is: " + sideC);

	}

	public void randMethod() {

		Random random = new Random();
		int randVal1 = random.nextInt(10);
		double randVal2 = random.nextDouble();
		boolean randVal3 = random.nextBoolean();
		float randVal4 = random.nextFloat();
		long randVal5 = random.nextLong();

		byte[] byteArr = new byte[10];
		random.nextBytes(byteArr);

		System.out.println("Random Integer: " + randVal1);
		System.out.println("Random Double: " + randVal2);
		System.out.println("Random Boolean: " + randVal3);
		System.out.println("Random Float: " + randVal4);
		System.out.println("Random Long Int: " + randVal5);

		System.out.println("\nRandom Bytes : \n");

		for (int i = 0; i < byteArr.length; i++) {
			System.out.println("Byte " + i + " : " + byteArr[i]);
		}
	}

	public void startGame() {

		Scanner scanner = new Scanner(System.in);

		String[] responseStrings = new String[] { "Mbwakni", "Saitan", "Bro", "Mjanjez", "Omokri", "Wamocho" };

		System.out.println("Enter a number between 1 and " + responseStrings.length + " :");
		int num = scanner.nextInt();
		System.out.println("Wewe ni " + responseStrings[num - 1]);

	}

	public int continueGame() {
		Scanner scanner = new Scanner(System.in);
		int retVal;
		do {
			System.out.println("Continue? [yes/no]");
			String replyString = scanner.next();
			if (replyString.equalsIgnoreCase("yes")) {
				retVal = 1;
			} else if (replyString.equalsIgnoreCase("no")) {
				retVal = 0;
			} else {
				System.out.println("Wrong Input! Try again!");
				retVal = 2;
			}
		} while (retVal == 2);

		return retVal;
	}

	public void roundFloorCeil() {
		int int1 = 58;
		int int2 = 95;
		double dbl1 = 87.1459D;
		float flt1 = 3.5475f;

		System.out.println("DOUBLE\n");
		System.out.println("Rounding " + dbl1 + " = " + Math.round(dbl1)); // NEAREST INTEGER
		System.out.println("Flooring " + dbl1 + " = " + Math.floor(dbl1)); // lower floating point
		System.out.println("Ceiling " + dbl1 + " = " + Math.ceil(dbl1)); // higher floating point

		System.out.println("FLOAT\n");
		System.out.println("Rounding " + flt1 + " = " + Math.round(flt1)); // NEAREST INTEGER
		System.out.println("Flooring " + flt1 + " = " + Math.floor(flt1)); // lower floating point
		System.out.println("Ceiling " + flt1 + " = " + Math.ceil(flt1)); // higher floating point

		System.out.println("INT\n");

		System.out.println("Rounding " + int1 + " = " + Math.round(int1)); // NEAREST INTEGER
		System.out.println("Flooring " + int1 + " = " + Math.floor(int1)); // lower floating point
		System.out.println("Ceiling " + int1 + " = " + Math.ceil(int1)); // higher floating point

	}

	public static void main(String[] args) {
		Arithmetics arithmetic = new Arithmetics();
		
		do {
			arithmetic.startGame();
		} while (arithmetic.continueGame()==1);
//

	}

}
