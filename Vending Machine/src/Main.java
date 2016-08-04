import java.awt.*;
import javax.swing.*;


public class Main {
	//global wallet variable
	public static double wallet = 0.00;
	
	//money variables
	public static double centsFive = 0.05;
	public static double centsTen = 0.10;
	public static double centsTwenty = 0.20;
	public static double centsFifty = 0.50;
	public static int dollarsOne = 1;
	public static int dollarsTwo = 2;
	public static int dollarsFive = 5;
	public static int dollarsTen = 10;
	public static int dollarsTwenty = 20;
	public static int dollarsFifty = 50;
	public static int dollarsHundred = 100;
	
	//stock variables
	public static int stockCoke = 8;
	public static int stockFanta = 8;
	public static int stockPepsi = 8;
	public static int stockSolo = 8;
	public static int stockDoritos = 8;
	public static int stockLambo = 1;
	public static int stockMountainDew = 8;
	
	//sold variables
	public static int soldCoke = 0;
	public static int soldFanta = 0;
	public static int soldPepsi = 0;
	public static int soldSolo = 0;
	public static int soldDoritos = 0;
	public static int soldLambo = 0;
	public static int soldMountainDew = 0;
	
	public static void createWindow(){
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
