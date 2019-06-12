package Intro_To_Random;
import java.util.Random;
public class IntroToRandom {
	public static void main(String[] Args) {
		Random Rand = new Random();
		int R = Rand.nextInt(101);
		System.out.println(R);
		R = Rand.nextInt(75 - 25 + 1) + 25; 
		System.out.println(R);
		R = Rand.nextInt(88 - -222 + 1) + -222;
		System.out.println(R); 
	}
}
