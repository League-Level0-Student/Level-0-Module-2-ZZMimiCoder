package Intro_To_Random;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class RockPaperScissors extends JPanel implements ActionListener {
	private JFrame Window = new JFrame("Rock Paper Scissors");
	private JButton RockButton = new JButton();
	private JButton PaperButton = new JButton();
	private JButton ScissorsButton = new JButton();
	private JLabel InstuctionLabel = new JLabel();
	private Icon RockImage;
	private Icon PaperImage;
	private Icon ScissorsImage;
	private Dimension ButtonDim = new Dimension(300, 200);
    public void run(){
		try {
			RockImage = new ImageIcon(getClass().getResource("rock.png"));
			PaperImage = new ImageIcon(getClass().getResource("paper.jpeg"));
			ScissorsImage = new ImageIcon(getClass().getResource("scissors.jpeg"));
		} catch (Exception Ex) {
			JOptionPane.showMessageDialog(null, "Cannot find one or more of your images");
		}
		RockButton.setIcon(RockImage);
		PaperButton.setIcon(PaperImage);
		ScissorsButton.setIcon(ScissorsImage);
        RockButton.addActionListener(this);
        PaperButton.addActionListener(this);
        ScissorsButton.addActionListener(this);
        RockButton.setPreferredSize(ButtonDim);
        PaperButton.setPreferredSize(ButtonDim);
        ScissorsButton.setPreferredSize(ButtonDim);
        InstuctionLabel.setText("Choose Your Weapon");
        add(InstuctionLabel);
        add(RockButton);
        add(PaperButton);
        add(ScissorsButton);
        Window.add(this);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.setVisible(true);
        Window.pack();
    }
    public static void main(String[] Args) {
        new RockPaperScissors().run();
    }
    public void actionPerformed(ActionEvent E) {
    	Random Rand = new Random();
        int OpponentSelection = Rand.nextInt(3);
        int Selection = 0;
        if (E.getSource() == PaperButton) {
            Selection = 1;
        } else if (E.getSource() == ScissorsButton){
            Selection = 2;
        }
        JOptionPane.showMessageDialog(null, "You chose: " + ConvertSelection(Selection) + ".\n"
                    + "The computer chose: " + ConvertSelection(OpponentSelection) + ".\n");
        if (Selection == OpponentSelection) {
            JOptionPane.showMessageDialog(null, "No Winner.  Play again.");
        } else if ((Selection == 0 && OpponentSelection == 2) || 
                 (Selection == 1 && OpponentSelection == 0) ||
                 (Selection == 2 && OpponentSelection == 1)) {
            JOptionPane.showMessageDialog(null, "You Win!");
        } else {
            JOptionPane.showMessageDialog(null, "You Lose!");
        }
    }
    private String ConvertSelection(int S){
       if (S == 0)
            return "Rock";
       else if (S == 1)
            return "Paper";
       else
            return "Scissors";
    }
}