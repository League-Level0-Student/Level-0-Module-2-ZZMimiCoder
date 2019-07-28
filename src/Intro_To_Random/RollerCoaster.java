package Intro_To_Random;
import javax.swing.JOptionPane;
public class RollerCoaster {
	public static void main(String[] Args) {
		String Height = JOptionPane.showInputDialog("How Tall Are You In Inches?");
		int Parsed = Integer.parseInt(Height);
		if (Parsed < 48) {
			System.out.println("Go Grow More");
		}
		else {
			System.out.println("You Can Go On The Ride");
		}
	}
}