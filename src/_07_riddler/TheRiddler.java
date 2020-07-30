package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
			int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
			String riddler	=  JOptionPane.showInputDialog("Which word in the dictionary is spelled incorrectly?");
			
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if (riddler.equals("Incorrectly")){
			JOptionPane.showMessageDialog(null, "Correct");
			score++;   	}
			if (riddler.equals("An Onion")) {
			JOptionPane.showMeasageDialog()
		// 5. Otherwise, say "wrong" and tell them the answer
			else {  
				JOptionPane.showMessageDialog(null, "Wrong!!");
			}
		// 6. Add some more riddles
riddler = JOptionPane.showInputDialog("Take off my skin - I won't cry, but you will! What am I?");
		// 2. Make a pop up to show the score.
		  JOptionPane.showMessageDialog(null, score);
	}
}

