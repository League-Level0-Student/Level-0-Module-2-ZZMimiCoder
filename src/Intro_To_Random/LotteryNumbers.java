package Intro_To_Random;

import java.util.Random;

public class LotteryNumbers {
	public static void main(String[] args) {
		Random RandGen = new Random();
		int Num1 = RandGen.nextInt(99);
		int Num2 = RandGen.nextInt(99);
		int Num3 = RandGen.nextInt(99);
		int Num4 = RandGen.nextInt(99);
		int Num5 = RandGen.nextInt(99);
		System.out.println("The Lottery Numbers Are: " + Num1 + ", " + Num2 + ", " + Num3 + ", " + Num4 + ", And " + Num5);
	}
}
