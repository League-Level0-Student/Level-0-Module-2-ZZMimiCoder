package Intro_To_Random;
import java.util.Random;
import javax.swing.JOptionPane;
public class Magic8Ball {
	public static void main(String[] Args) {
		Random Rand = new Random();
		int R = Rand.nextInt(4);
		JOptionPane.showInputDialog("Ask a question:");
		if(R == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
		else if(R == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}
		else if(R == 2) {
			JOptionPane.showMessageDialog(null, "Ask Google");
		}
		else {
			JOptionPane.showMessageDialog(null, "Ask Later");
		}
	}
}
