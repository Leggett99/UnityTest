import java.awt.*;
import javax.swing.*;

public class Main {
	public static void createWindow(){
		double wallet = 0.00;
		double[] coins = new double[6];
			coins[0] = 0.05;
		JFrame window = new JFrame("Simple GUI");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel textLabel = new JLabel("I'm some text in the window", SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension(300, 100));
		window.getContentPane().add(textLabel, BorderLayout.CENTER);
		window.setLocationRelativeTo(null);
		window.pack();
		window.setVisible(true);
		window.add(new JLabel(new ImageIcon("C:/Users/Josh/Documents/GitHub/Vending/50dorra.PNG")));
		
	}
	public static void main(String[] args){
		createWindow();
	}
}
