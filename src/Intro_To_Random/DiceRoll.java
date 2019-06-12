package Intro_To_Random;
import java.awt.Dimension;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class DiceRoll {
	private JFrame Window = new JFrame("Roll the Dice!");
	private JPanel Panel = new JPanel();
	private JButton RollButton = new JButton("Click Here To Roll!");
	private JLabel Label = new JLabel();
	private Icon OneImg;
	private Icon TwoImg;
	private Icon ThreeImg;
	private Icon FourImg;
	private Icon FiveImg;
	private Icon SixImg;
	public static void main(String[] Args) {
		new DiceRoll().Run();
	}
	public void Run() {
		try {
			OneImg = new ImageIcon(getClass().getResource("Dice_1.png"));
			TwoImg = new ImageIcon(getClass().getResource("Dice_2.png"));
			ThreeImg = new ImageIcon(getClass().getResource("Dice_3.png"));
			FourImg = new ImageIcon(getClass().getResource("Dice_4.png"));
			FiveImg = new ImageIcon(getClass().getResource("Dice_5.png"));
			SixImg = new ImageIcon(getClass().getResource("Dice_6.png"));
		} catch (Exception E) {
			JOptionPane.showMessageDialog(null, "Error");
			System.exit(0);
		}
		Label.setIcon(OneImg);
		RollButton.addActionListener((E) -> {
			Random Rand = new Random();
			int RandomChoice = Rand.nextInt(6);
			if (RandomChoice == 0) {
				Label.setIcon(OneImg);
			} else if (RandomChoice == 1) {
				Label.setIcon(TwoImg);
			} else if (RandomChoice == 2) {
				Label.setIcon(ThreeImg);
			} else if (RandomChoice == 3) {
				Label.setIcon(FourImg);
			} else if (RandomChoice == 4) {
				Label.setIcon(FiveImg);
			} else {
				Label.setIcon(SixImg);
			}
		});
		Panel.setPreferredSize(new Dimension(700, 700));
		Panel.add(RollButton);
		Panel.add(Label);
		Window.add(Panel);
		Window.setVisible(true);
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Window.pack();
	}
}
