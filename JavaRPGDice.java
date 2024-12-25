// Code by nathaliarmolina
// https://github.com/nathaliarmolina

//packtage
package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JavaRPGDice implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	JLabel title, number, alert;
	JComboBox<String> comboSides;
	JButton roll;
	Random random;
	String result;
	int mod;
	int rand;
	int flag = 1;
	
	// constructor
	public JavaRPGDice()  {
		
		
		
		// font types
        Font fontNumber= new Font("Candara",Font.BOLD,75);
        Font fontTitle = new Font("Candara",Font.BOLD,26);
        Font font2 = new Font("Candara",Font.BOLD,17);
		
		frame = new JFrame("Java RPG Dice"); // create JFrame
		frame.setSize(500, 450);  // set size
		frame.setLocationRelativeTo(null); // centralize window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close program 
		frame.setLayout(null); // no layout mode
		
		panel = new JPanel(); // create JPanel
		panel.setSize(500,450); // set size
		panel.setBackground(Color.black); // set background color
		panel.setLayout(null); //no layout mode
		frame.add(panel); // add panel to frame
		
		title = new JLabel("Java RPG Dice"); // create Title
		title.setForeground(Color.red); // set font color
		title.setBounds(160, 20, 230, 35); // set coordinates and size
		title.setFont(fontTitle); // set Font
		panel.add(title); // add title to panel
		
		// combobox of Sides

		String[] sides = {"Choose your dice size", "D2", "D3", "D4", "D6", "D8", "D10", "D12", "D20", "D100"}; // dice options
		comboSides = new JComboBox<String>(sides); // create JComboBox
		comboSides.setBounds(160, 60, 160, 30); // set coordinates and size
		panel.add(comboSides); // add comboSides to panel
		
		roll = new JButton("Roll"); // create Roll Button
		roll.setBounds(200, 110, 70, 35); // set coordinates and size
		roll.setFont(font2); // set Font
		roll.addActionListener(this); // add roll actionListener
		panel.add(roll); // add roll to panel
		
		number = new JLabel(""); // create number JLabel
		number.setForeground(Color.orange); // set font color
		number.setBounds(225, 220, 230, 80); // set coordinates and size
		number.setFont(fontNumber); // set Font
		panel.add(number); // add number to panel
		
	
		alert = new JLabel(""); // create alert JLabel
		alert.setForeground(Color.red); // set font color
		alert.setBounds(185, 260, 180, 45); // set coordinates and size
		alert.setFont(font2); // set Font
		panel.add(alert); // add alert to panel

		// create random object
		random = new Random();
		
		// add comboSides actionListener
		comboSides.addActionListener(this);
		
		// set frame visible after all elements
		frame.setVisible(true);
		
		
	}
	
	
	// main method to run the program
	public static void main (String [] args) {
		
		JavaRPGDice dice = new JavaRPGDice();
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		// Roll Buttons Events
		if(e.getSource() == roll) {
			
			//get Selected Item from Combobox and set it to a string
			String selectedItem = (String) comboSides.getSelectedItem();
			
			//D2 DICE
			if (selectedItem.equals("D2")) {
				alert.setText(""); // clear alert
				rand = random.nextInt(2) + 1; // get random number from 1 to 2
				result = Integer.toString(rand); // convert random number to string
				number.setText(result); // show result
				
				//change the number's color
				
				flag ++; // increments flag
				mod = flag % 2; // see if the flag is odds or evens and changes the color
				if (mod == 0) { 
					number.setForeground(Color.cyan);
				}
				
				else {
					number.setForeground(Color.orange);
				}
				
			}
			
			//D3 DICE
			if (selectedItem.equals("D3")) {
				alert.setText(""); // clear alert
				rand = random.nextInt(3) + 1; // get random number from 1 to 3
				result = Integer.toString(rand); // convert random number to string
				number.setText(result); // show result
				
				// change the number's color
				
				flag ++; // increments flag
				mod = flag % 2; // see if the flag is odds or evens and changes the color
				if (mod == 0) {
					number.setForeground(Color.magenta);
				}
				
				else {
					number.setForeground(Color.green);
				}
				
				
				
			}
			
			//D4 DICE
			if (selectedItem.equals("D4")) {
				alert.setText(""); // clear alert
				rand = random.nextInt(4) + 1; // get random number from 1 to 4
				result = Integer.toString(rand); // convert random number to string
				number.setText(result); // show result
				
				// change the number's color
				
				flag ++; // increments flag
				mod = flag % 2; // see if the flag is odds or evens and changes the color
				if (mod == 0) {
					number.setForeground(Color.cyan);
				}
				
				else {
					number.setForeground(Color.orange);
				}
			}
			
			//D6 DICE
			if (selectedItem.equals("D6")) {
				alert.setText(""); // clear alert
				rand = random.nextInt(6) + 1; // get random number from 1 to 6
				result = Integer.toString(rand); // convert random number to string
				number.setText(result); // show result
				
				// change the number's color
				
				flag ++; // increments flag
				mod = flag % 2; // see if the flag is odds or evens and changes the color
				if (mod == 0) {
					number.setForeground(Color.magenta);
				}
				
				else {
					number.setForeground(Color.green);
				}
			}
			
			//D8 DICE
			if (selectedItem.equals("D8")) {
				alert.setText(""); // clear alert
				rand = random.nextInt(8) + 1; // get random number from 1 to 8
				result = Integer.toString(rand); // convert random number to string
				number.setText(result); // show result
				
				// change the number's color
				
				flag ++; // increments flag
				mod = flag % 2; // see if the flag is odds or evens and changes the color
				if (mod == 0) {
					number.setForeground(Color.cyan);
				}
				
				else {
					number.setForeground(Color.orange);
				}
			}
			
			//D10
			if (selectedItem.equals("D10")) {
				alert.setText(""); // clear alert
				rand = random.nextInt(10) + 1; // get random number from 1 to 10
				result = Integer.toString(rand); // convert random number to string
				number.setText(result); // show result
				
				// Centralize Number if one digit or two digits
				
				if (rand <=9) {
				number.setBounds(230, 220, 230, 80);
				}
				
				if(rand == 10) {
					number.setBounds(210, 220, 230, 80);
					
				}
				
				// change the number's color
				
				flag ++; // increments flag
				mod = flag % 2; // see if the flag is odds or evens and changes the color
				if (mod == 0) {
					number.setForeground(Color.magenta);
				}
				
				else {
					number.setForeground(Color.green);
				}
			}
			
			//D12 DICE
			if (selectedItem.equals("D12")) {
				alert.setText(""); // clear alert
				rand = random.nextInt(12) + 1; // get random number from 1 to 12
				result = Integer.toString(rand); // convert random number to string
				number.setText(result); // show result
				
				// Centralize Number if one digit or two digits
				
				if (rand <=9) {
					number.setBounds(230, 220, 230, 80);
					}
				
				if(rand >= 10) {
					number.setBounds(210, 220, 230, 80);
					
				}
				
				// change the number's color
				
				flag ++; // increments flag
				mod = flag % 2; // see if the flag is odds or evens and changes the color
				if (mod == 0) {
					number.setForeground(Color.cyan);
				}
				
				else {
					number.setForeground(Color.orange);
				}
				
				if (rand <=9) {
					number.setBounds(230, 220, 230, 80);
					}
				
				if(rand >= 10) {
					number.setBounds(215, 220, 230, 80);
					
				}
			}
						
			//D20 DICE
			if (selectedItem.equals("D20")) {
				alert.setText(""); // clear alert
				rand = random.nextInt(20) + 1; // get random number from 1 to 20
				result = Integer.toString(rand); // convert random number to string
				number.setText(result); // show result
				
				// Centralize Number if one digit or two digits
				
				if (rand <=9) {
					number.setBounds(230, 220, 230, 80);
					}
				
				if(rand >= 10) {
					number.setBounds(215, 220, 230, 80);
					
				}
				
				
				// change the number's color
				
				flag ++; // increments flag
				mod = flag % 2; // see if the flag is odds or evens and changes the color
				if (mod == 0) {
					number.setForeground(Color.magenta);
				}
				
				else {
					number.setForeground(Color.green);
				}
			}
			
			//D100 DICE
			if (selectedItem.equals("D100")) {
				alert.setText(""); // clear alert
				rand = random.nextInt(100) + 1; // get random number from 1 to 100
				result = Integer.toString(rand); // convert random number to string
				number.setText(result); // show result
				
				// Centralize Number if one digit, two digits or three digits
				
				if (rand <=9) {
					number.setBounds(230, 220, 230, 80);
					}
								
				if(rand >= 10) {
					number.setBounds(215, 220, 230, 80);
					
				}
				
				if (rand == 100) {
					number.setBounds(190, 220, 230, 80);
					
				}
				
				// change the number's color
				
				flag ++; // increments flags
				mod = flag % 2; // see if the flag is odds or evens and changes the color
				if (mod == 0) {
					number.setForeground(Color.cyan);
				}
				
				else {
					number.setForeground(Color.orange);
				}
			}
			
			// display alert if no dice is chosen
			if (selectedItem.equals("Choose your dice size")) {
				alert.setText("Choose a dice");
				number.setText("");
			}
			
		} // end roll button
		

	} // end actionPerformed

} // end class

