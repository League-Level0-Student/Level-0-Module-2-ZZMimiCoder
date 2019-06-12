package Intro_To_Random;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
public class SafeCracker {
	public static void main(String[] args) {
		for (int X = 0; X < 10000000; X++) {
			TryCode(X);
		}
	}
	static void TryCode(int Guess) {
		System.out.println("Trying " + Guess);
		int SecretCode = 9999999 - Number;
		if (Guess == SecretCode) {
			JOptionPane.showMessageDialog(null, "This Program Cracked The Safe With " + Guess + " Guess/Guesses.");
			PlayTheSoundOfSuccess();
			System.exit(0);
		}
	}
	private static void PlayTheSoundOfSuccess() {
		try {
			AudioClip Sound = JApplet.newAudioClip(SafeCracker.class.getResource("Me_Gusta.wav"));
			Sound.play();
			Thread.sleep(3400);
		} catch (Exception Ex) {
			Ex.printStackTrace();
		}
	}
	final static int Number = new Random().nextInt(100);
}
