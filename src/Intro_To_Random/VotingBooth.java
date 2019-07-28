package Intro_To_Random;
import javax.swing.JOptionPane;
public class VotingBooth {
	public static void main(String[] Args) {
		String Height = JOptionPane.showInputDialog("How Old Are You In Years?");
		int Parsed = Integer.parseInt(Height);
		if (Parsed > 17) {
			JOptionPane.showInputDialog("Who Do You Think The Next President Will Be?");
		}
		else {
			System.out.println("Nobody Cares What You Think");
		}
	}
}