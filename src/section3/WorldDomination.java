package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String answer=JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if(answer.equalsIgnoreCase("yes")) { //if statements have no semicolons
	JOptionPane.showMessageDialog(null,"Have fun Ruling the World!");
		// 3. Otherwise, wish them good luck washing dishes.
}else {
	JOptionPane.showMessageDialog(null,"Good Luck washing dishes :(");
	}
}}

