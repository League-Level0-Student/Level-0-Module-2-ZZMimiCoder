package Intro_To_Random;
import java.applet.AudioClip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
public class AnimalFarm {
	AnimalFarm() {
		for (;;) {
		String answer = JOptionPane.showInputDialog("Which Animal?");
		if (answer.equals("Llama")) {
			PlayLlama();
		}
		else if (answer.equals("Cat")) {
			PlayMeow();
		}
		else if (answer.equals("Cow")) {
			PlayMoo();
		}
		else if (answer.equals("Duck")) {
			PlayQuack();
		}
		else if (answer.equals("Dog")) {
			PlayWoof();
		}
		else {
			System.out.println("Error");
		}
	}
}
	void PlayLlama() {
		PlayNoise(LlamaFile);
	}
	void PlayMeow() {
		PlayNoise(MeowFile);
	}
	void PlayMoo() {
		PlayNoise(MooFile);
	}
	void PlayQuack() {
		PlayNoise(QuackFile);
	}
	void PlayWoof() {
		PlayNoise(WoofFile);
	}
	String QuackFile = "Quack.wav";
	String MooFile = "Moo.wav";
	String WoofFile = "Woof.wav";
	String MeowFile = "Meow.wav";
	String LlamaFile = "Llama.wav";
	public void PlayNoise(String soundFile) {
		try {
			AudioClip Sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			Sound.play();
			Thread.sleep(3400);
		} catch (Exception Ex) {
			Ex.printStackTrace();
		}
	}
	public static void main(String[] Args) {
		new AnimalFarm();
	}

}
