package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbrithday {

public static void main(String[] args) {
	

String birthday = JOptionPane.showInputDialog("When is your birthday");

if(birthday.equals("03/05/2020")){
	JOptionPane.showMessageDialog(null,"Happy Birthday"); 
}
else { 
	if(birthday.equals("03/19/2020")){
		JOptionPane.showMessageDialog(null,"Merry Unbirthday");
		
	}
}

}
}

